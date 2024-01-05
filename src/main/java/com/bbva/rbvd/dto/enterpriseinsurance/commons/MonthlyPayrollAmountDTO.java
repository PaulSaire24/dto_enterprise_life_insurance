package com.bbva.rbvd.dto.enterpriseinsurance.commons;

public class MonthlyPayrollAmountDTO extends CommonFieldsDTO{
    @Override
    public String toString() {
        return "MonthlyPayrollAmountDTO={" +
                "amount='" + this.getAmount() + '\'' +
                ", currency='" + this.getCurrency()+ '\''+
                "}";
    }

}
