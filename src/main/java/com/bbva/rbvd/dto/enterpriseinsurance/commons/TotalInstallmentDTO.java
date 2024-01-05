package com.bbva.rbvd.dto.enterpriseinsurance.commons;

public class TotalInstallmentDTO extends CommonFieldsDTO{
    @Override
    public String toString() {
        return "TotalInstallmentDTO={" +
                "amount='" + this.getAmount() + '\'' +
                ", currency='" + this.getCurrency()+ '\''+
                ", period='" + this.getPeriod()+ '\''+
                "}";
    }

}
