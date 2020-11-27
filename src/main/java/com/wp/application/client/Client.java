package com.wp.application.client;

import cn.hutool.core.io.unit.DataUnit;
import com.wp.application.keepaccount.bean.CarAccount;
import com.wp.application.utils.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    /**
     *
     * @param date DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     * @param months
     */
    public  static  List<CarAccount> getCarMonth(String time, int months, double payment ){
        List<CarAccount> carMonth = new ArrayList<>();

        for (int i = 0; i < months; i++){
            Date date = DateUtil.nextDate(DateUtil.parseDate(time), i);
            System.out.println(DateUtil.formatDate(date));
        }

        return carMonth;
    }


    public static void main(String args[]){


//        System.out.println(DateUtil.isValidFormat("2020-11-25 11:22:99"));
//        System.out.println(DateUtil.isValidFormat("2020-11-25 11:22:00"));
//        System.out.println(DateUtil.isValidFormat("2020-1111-25 11:22:99"));
//        System.out.println(DateUtil.isValidFormat("2020-11-25"));
//        System.out.println(DateUtil.isValidFormat("2020-1-25 11:2:0"));
//        getCarMonth("2020-11-27 18:00:00",24, 1);

//        for (int i = 0; i < 12 * 2; i++){
//            DateTime date = DateTime.of("2019-6-11", "yyyy-MM-dd");
//            carMonth.add(date.offset(DateField.MONTH, i) );
//        }
//        for (int i = 0; i < 12 * 2; i++){
//            DateTime dateTime = carMonth.get(i);
//            String string = DateUtil.format(dateTime,"yyyy-MM-dd");
//            System.out.println(string);
//        }


//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.get(Calendar.MONDAY) + 1);
//
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
