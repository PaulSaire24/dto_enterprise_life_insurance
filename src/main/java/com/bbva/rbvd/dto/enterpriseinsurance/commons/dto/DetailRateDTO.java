package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DetailRateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rateType;
    private String description;
    private Date calculationDate;
    private List<DetailRateUnitDTO> itemizeRateUnits;

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(Date calculationDate) {
        this.calculationDate = calculationDate;
    }

    public List<DetailRateUnitDTO> getItemizeRateUnits() {
        return itemizeRateUnits;
    }

    public void setItemizeRateUnits(List<DetailRateUnitDTO> itemizeRateUnits) {
        this.itemizeRateUnits = itemizeRateUnits;
    }

    @Override
    public String toString() {
        return "DetailRateDTO{" +
                "rateType='" + rateType + '\'' +
                ", description='" + description + '\'' +
                ", calculationDate=" + calculationDate +
                ", itemizeRateUnits=" + itemizeRateUnits +
                '}';
    }
}
