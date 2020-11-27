package com.wp.application.keepaccount.bean;


public class CarAccount{

    public String monthDate;

    public double amount;

    /**
     * 1 待还款，
     * 2 已还款
     */
    public int status = 1;
//    public String statusDesc = "待还款";

    public void setStatus(int status) {
        this.status = status;
//        switch (status){
//            case 1:
//                this.statusDesc = "待还款";
//                break;
//
//            case 2:
//                this.statusDesc = "已还款";
//                break;
//        }
    }
}
