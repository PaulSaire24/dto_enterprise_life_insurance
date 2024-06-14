package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;
import java.util.List;

public class TaxesDTO implements Serializable {

    private AmountDTO totalTaxes;
    private List<ItemizeTaxesDTO>  itemizeTaxes;

    public AmountDTO getTotalTaxes() {
        return totalTaxes;
    }

    public void setTotalTaxes(AmountDTO totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public List<ItemizeTaxesDTO> getItemizeTaxes() {
        return itemizeTaxes;
    }

    public void setItemizeTaxes(List<ItemizeTaxesDTO> itemizeTaxes) {
        this.itemizeTaxes = itemizeTaxes;
    }

    @Override
    public String toString() {
        return "TaxesDTO{" +
                "totalTaxes=" + totalTaxes +
                ", itemizeTaxes=" + itemizeTaxes +
                '}';
    }
}
