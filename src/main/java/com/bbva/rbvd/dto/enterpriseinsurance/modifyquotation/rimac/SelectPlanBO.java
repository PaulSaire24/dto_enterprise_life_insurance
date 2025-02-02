package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.rimac;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectPlanBO {

    private SelectPlanPayloadBO payload;

    public SelectPlanPayloadBO getPayload() {
        return payload;
    }

    public void setPayload(SelectPlanPayloadBO payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SelectPlanBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }
}
