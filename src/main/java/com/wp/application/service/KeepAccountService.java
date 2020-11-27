package com.wp.application.service;


import com.wp.application.keepaccount.bean.CarAccount;
import com.wp.application.utils.DateUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class KeepAccountService {

    /**
     * @param time
     * @param months
     * @param payment
     * @return
     */
    public List<CarAccount> getCarMonth(String time, int months, double payment ){
        List<CarAccount> carMonth = new ArrayList<>();

        for (int i = 0; i < months; i++){
            CarAccount account = new CarAccount();
            account.monthDate = DateUtil.formatDate(DateUtil.nextDate(DateUtil.parseDate(time), i));
            account.amount = payment;

            if (DateUtil.parseLong(new Date()) > DateUtil.parseLong(account.monthDate)){
                account.setStatus(2);
            }else{
                account.setStatus(1);
            }
            carMonth.add(account);
        }

        return carMonth;
    }
}
