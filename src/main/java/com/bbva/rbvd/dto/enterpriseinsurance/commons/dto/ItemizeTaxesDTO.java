package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;
import java.util.List;

public class ItemizeTaxesDTO implements Serializable {
    private String taxType;
    private String description;
    private List<DetailRateUnitDTO> itemizeTaxUnits;

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DetailRateUnitDTO> getItemizeTaxUnits() {
        return itemizeTaxUnits;
    }

    public void setItemizeTaxUnits(List<DetailRateUnitDTO> itemizeTaxUnits) {
        this.itemizeTaxUnits = itemizeTaxUnits;
    }

    @Override
    public String toString() {
        return "ItemizeTaxesDTO{" +
                "taxType='" + taxType + '\'' +
                ", description='" + description + '\'' +
                ", itemizeTaxUnits=" + itemizeTaxUnits +
                '}';
    }
}
