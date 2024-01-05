package com.bbva.rbvd.dto.enterpriseinsurance.commons;

public class PaymentAmountDTO extends  CommonFieldsDTO{
    public String toString() {
        return "PaymentAmountDTO={" +
                "amount='" + this.getAmount() + '\'' +
                ", currency='" + this.getCurrency()+ '\''+
                "}";
    }
}
