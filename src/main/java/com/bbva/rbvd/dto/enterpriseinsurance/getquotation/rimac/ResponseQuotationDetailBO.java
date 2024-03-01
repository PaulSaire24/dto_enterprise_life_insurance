package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.rimac;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseQuotationDetailBO {

    private ResponsePayloadQuotationDetailBO payload;

    public ResponsePayloadQuotationDetailBO getPayload() {
        return payload;
    }

    public void setPayload(ResponsePayloadQuotationDetailBO payload) {
        this.payload = payload;
    }


    @Override
    public String toString() {
        return "ResponseQuotationDetailBO{" +
                "payload=" + payload +
                '}';
    }
}
