package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.util.List;

public class PlanDTO extends  CommonFieldsDTO{
    private Boolean isSelected;
    private Boolean isRecommended;
    private TotalInstallmentDTO totalInstallment;
    private List<InstallmentPlansDTO> installmentPlans;
    private List<CoverageDTO> coverages;
    private List<ExclusionsDTO> exclusions;
    private List<BenefitsDTO> benefits;

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    public Boolean getRecommended() {
        return isRecommended;
    }

    public void setRecommended(Boolean recommended) {
        isRecommended = recommended;
    }

    public TotalInstallmentDTO getTotalInstallment() {
        return totalInstallment;
    }

    public void setTotalInstallment(TotalInstallmentDTO totalInstallment) {
        this.totalInstallment = totalInstallment;
    }

    public List<InstallmentPlansDTO> getInstallmentPlans() {
        return installmentPlans;
    }

    public void setInstallmentPlans(List<InstallmentPlansDTO> installmentPlans) {
        this.installmentPlans = installmentPlans;
    }

    public List<CoverageDTO> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<CoverageDTO> coverages) {
        this.coverages = coverages;
    }

    public List<ExclusionsDTO> getExclusions() {
        return exclusions;
    }

    public void setExclusions(List<ExclusionsDTO> exclusions) {
        this.exclusions = exclusions;
    }

    public List<BenefitsDTO> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<BenefitsDTO> benefits) {
        this.benefits = benefits;
    }

    public PlanDTO() {
        this.isRecommended = false;
    }

    @Override
    public String toString() {
        return "PlanDTO{" +
                "id='" + this.getId()+ + '\''+
                ", name='" + this.getName()+ '\''+
                ", isSelected=" + isSelected +
                ", isRecommended=" + isRecommended +
                ", totalInstallment=" + totalInstallment +
                ", installmentPlans=" + installmentPlans +
                ", coverages=" + coverages +
                ", exclusions=" + exclusions +
                ", benefits=" + benefits +
                '}';
    }
}
