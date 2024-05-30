package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;
import java.util.List;

public class RateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<DetailRateDTO> itemizeRates;

    public List<DetailRateDTO> getItemizeRates() {
        return itemizeRates;
    }

    public void setItemizeRates(List<DetailRateDTO> itemizeRates) {
        this.itemizeRates = itemizeRates;
    }

    @Override
    public String toString() {
        return "RateDTO{" +
                "itemizeRates=" + itemizeRates +
                '}';
    }
}
