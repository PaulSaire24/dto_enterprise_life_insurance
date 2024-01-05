package com.bbva.rbvd.dto.enterpriseinsurance.commons;

public class EmployeesDTO {
    private Boolean areMajorityAge;

    private Integer employeesNumber;

    private MonthlyPayrollAmountDTO monthlyPayrollAmount;

    public Boolean getAreMajorityAge() {
        return areMajorityAge;
    }

    public void setAreMajorityAge(Boolean areMajorityAge) {
        this.areMajorityAge = areMajorityAge;
    }

    public Integer getEmloyeesNumber() {
        return employeesNumber;
    }

    public void setEmloyeesNumber(Integer emloyeesNumber) {
        this.employeesNumber = emloyeesNumber;
    }

    public MonthlyPayrollAmountDTO getMonthlyPayrollAmount() {
        return monthlyPayrollAmount;
    }

    public void setMonthlyPayrollAmount(MonthlyPayrollAmountDTO monthlyPayrollAmount) {
        this.monthlyPayrollAmount = monthlyPayrollAmount;
    }

    @Override
    public String toString() {
        return "EmployeesDTO{" +
                "areMajorityAge=" + areMajorityAge +
                ", employeesNumber=" + employeesNumber +
                ", monthlyPayrollAmount=" + monthlyPayrollAmount +
                '}';
    }
}
