package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;
import java.util.Date;

public class TotalInstallmentDTO extends AmountDTO {

    private DescriptionDTO period;

    public DescriptionDTO getPeriod() {
        return period;
    }

    public void setPeriod(DescriptionDTO period) {
        this.period = period;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AmountDTO{");
        sb.append("amount=").append(this.getAmount());
        sb.append(", currency='").append(this.getPeriod()).append('\'');
        sb.append(", period='").append(period);
        sb.append('}');
        return sb.toString();
    }
}
