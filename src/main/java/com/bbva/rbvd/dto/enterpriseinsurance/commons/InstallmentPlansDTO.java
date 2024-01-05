package com.bbva.rbvd.dto.enterpriseinsurance.commons;

public class InstallmentPlansDTO extends CommonFieldsDTO {
    private Long paymentsTotalNumber;
    private PaymentAmountDTO paymentAmount;

    public Long getPaymentsTotalNumber() {
        return paymentsTotalNumber;
    }

    public void setPaymentsTotalNumber(Long paymentsTotalNumber) {
        this.paymentsTotalNumber = paymentsTotalNumber;
    }

    public PaymentAmountDTO getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(PaymentAmountDTO paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "InstallmentPlansDTO{" +
                "paymentsTotalNumber=" + paymentsTotalNumber +
                ", paymentAmount=" + paymentAmount +
                ", period=" + this.getPeriod() +
                '}';
    }
}
