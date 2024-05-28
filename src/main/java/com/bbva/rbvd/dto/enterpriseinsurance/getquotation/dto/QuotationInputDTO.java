package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.dto;

import java.io.Serializable;

public class QuotationInputDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private String quotationId;
    private String traceId;
    private String transactionCode;

    public String getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    @Override
    public String toString() {
        return "QuotationInputDTO{" +
                "quotationId='" + quotationId + '\'' +
                ", traceId='" + traceId + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                '}';
    }
}
