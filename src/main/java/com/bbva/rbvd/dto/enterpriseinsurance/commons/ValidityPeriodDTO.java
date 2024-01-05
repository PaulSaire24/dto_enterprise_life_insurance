package com.bbva.rbvd.dto.enterpriseinsurance.commons;

import java.util.Date;

public class ValidityPeriodDTO {
    private Date startDate;
    private Date endDate;
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ValidityPeriodDTO{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
