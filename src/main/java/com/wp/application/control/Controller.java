package com.wp.application.control;

import com.wp.application.bean.Person;
import com.wp.application.exception.BaseException;
import com.wp.application.exception.ErrorCode;
import com.wp.application.keepaccount.bean.pojo.CarAccountVojo;
import com.wp.application.service.KeepAccountService;
import com.wp.application.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    @ResponseBody
    public Person hello(String name){
        System.out.println(name);

        return new Person(1, name == null ? "gbh" : name);
    }

    @Autowired
    KeepAccountService keepAccountService;

    @GetMapping("/getMonth/{time}") //"2019-6-11 18:00:00"
    @ResponseBody
    public CarAccountVojo getMonth(@PathVariable("time") String time){

        if (!DateUtil.isValidFormat(time)){

            CarAccountVojo vojo = new CarAccountVojo();
            vojo.code = ErrorCode.HTTP_PARAM_ERROR;
            vojo.msg = "URL中的日期格式错误";

            return vojo;
        }

        CarAccountVojo vojo = new CarAccountVojo();
        vojo.data = keepAccountService.getCarMonth(time, 24, 1780.00);

        for (int i = 0; i < vojo.data.size(); i++){
            if (vojo.data.get(i).status == 1){ // 待
                vojo.totalDebt += vojo.data.get(i).amount;
                vojo.periodsDebt += 1;
            }else{
                vojo.totalRepayment += vojo.data.get(i).amount;
                vojo.periodsRepayment += 1;
            }
        }

        return vojo;
    }

}
