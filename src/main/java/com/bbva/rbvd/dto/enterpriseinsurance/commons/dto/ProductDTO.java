package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.util.List;

public class ProductDTO extends CommonFieldsDTO{
    private List<PlanDTO> plans;

    public List<PlanDTO> getPlans() { return plans; }
    public void setPlans(List<PlanDTO> plans) { this.plans = plans; }


    @Override
    public String toString() {
        return "ProductDTO{" +
                "id='" + this.getId()+ + '\''+
                ", name='" + this.getName()+ '\''+
                ", plans=" + plans +
                '}';
    }
}
