package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.util.List;

public class PlanDTO extends  CommonFieldsDTO{

    private AmountDTO totalInstallment;
    private List<InstallmentPlansDTO> installmentPlans;
    private List<CoverageDTO> coverages;
    private List<DescriptionDTO> exclusions;
    private List<DescriptionDTO> benefits;
    private RateDTO rates;
    private AmountDTO maximumSalaryAmount;
    private List<TaxesDTO> taxes;
    private AmountDTO totalInstallmentWithoutTax;

    public AmountDTO getTotalInstallment() {
        return totalInstallment;
    }

    public void setTotalInstallment(AmountDTO totalInstallment) {
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

    public List<DescriptionDTO> getExclusions() {
        return exclusions;
    }

    public void setExclusions(List<DescriptionDTO> exclusions) {
        this.exclusions = exclusions;
    }

    public List<DescriptionDTO> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<DescriptionDTO> benefits) {
        this.benefits = benefits;
    }

    public RateDTO getRates() {
        return rates;
    }

    public void setRates(RateDTO rates) {
        this.rates = rates;
    }

    public AmountDTO getMaximumSalaryAmount() {
        return maximumSalaryAmount;
    }

    public void setMaximumSalaryAmount(AmountDTO maximumSalaryAmount) {
        this.maximumSalaryAmount = maximumSalaryAmount;
    }

    public List<TaxesDTO> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<TaxesDTO> taxes) {
        this.taxes = taxes;
    }

    public AmountDTO getTotalInstallmentWithoutTax() {
        return totalInstallmentWithoutTax;
    }

    public void setTotalInstallmentWithoutTax(AmountDTO totalInstallmentWithoutTax) {
        this.totalInstallmentWithoutTax = totalInstallmentWithoutTax;
    }

    @Override
    public String toString() {
        return "PlanDTO{" +
                "totalInstallment=" + totalInstallment +
                ", installmentPlans=" + installmentPlans +
                ", coverages=" + coverages +
                ", exclusions=" + exclusions +
                ", benefits=" + benefits +
                ", rates=" + rates +
                ", maximumSalaryAmount=" + maximumSalaryAmount +
                ", taxes=" + taxes +
                ", totalInstallmentWithoutTax=" + totalInstallmentWithoutTax +
                '}';
    }
}
