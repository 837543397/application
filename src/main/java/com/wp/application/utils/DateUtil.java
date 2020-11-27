package com.wp.application.utils;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {


    private static String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * @param time "2020-11-27 11:00:00"
     */
    public static Date parseDate(String time){
        return parseDate(time, DEFAULT_PATTERN);
    }

    /**
     *  字符串格式化为日期
     * @param time "2017-08-07 11:00:00"
     * @param pattern "yyyy-MM-dd HH:mm:ss"
     * @return
     */
    public static Date parseDate(String time, String pattern){
        DateFormat df = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = df.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    /**
     * 日期格式化为字符串
     * @param date
     */
    public static String formatDate(Date date) {
        return  formatDate(date, DEFAULT_PATTERN);
    }

    /**
     * 日期格式化为字符串
     * @param date
     * @param format
     * @return
     */
    public static String formatDate(Date date, String format) {
        if (date == null) {
            return null;
        }
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(date);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    /**
     * 得到下个月
     * @param date
     * @return
     */
    public static Date nextDate(Date date) {
        return nextDate(date, 1);
    }

    public static Date nextDate(Date date, int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,n);

        return calendar.getTime();
    }

    public static long parseLong(String time){
        return parseLong(time, DEFAULT_PATTERN);
    }

    public static long parseLong(String time, String pattern){
        return parseDate(time, pattern).getTime();
    }

    public static long parseLong(Date date){
        return date.getTime();
    }

    public static boolean isValidFormat(String time) {
        return  isValidFormat(time, DEFAULT_PATTERN);
    }

    public static boolean isValidFormat(String time, String pattern) {
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        try {
            sf.setLenient(false);
            sf.parse(time);
        }catch (ParseException e){
            return false;
        }

        return true;
    }




}
