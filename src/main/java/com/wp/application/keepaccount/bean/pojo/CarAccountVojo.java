package com.wp.application.keepaccount.bean.pojo;

import com.wp.application.keepaccount.bean.BaseResponse;
import com.wp.application.keepaccount.bean.CarAccount;

import java.util.List;

public class CarAccountVojo extends BaseResponse {

    public List<CarAccount> data;

    public double totalRepayment = 0;
    public double totalDebt = 0;

    public int periodsRepayment = 0;
    public int periodsDebt = 0;

}
