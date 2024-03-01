package com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancingBO extends CommonsBO{

    private String periodicidad;
    private String indicadorDescuentoPrima;
    private BigDecimal montoNetoFraccionado;
    private BigDecimal montoPago;
    private Long financiamiento;
    private Long numeroCuotas;

    private List<InstallmentFinancingBO> cuotasFinanciamiento;

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getIndicadorDescuentoPrima() {
        return indicadorDescuentoPrima;
    }

    public void setIndicadorDescuentoPrima(String indicadorDescuentoPrima) {
        this.indicadorDescuentoPrima = indicadorDescuentoPrima;
    }

    public BigDecimal getMontoNetoFraccionado() {
        return montoNetoFraccionado;
    }

    public void setMontoNetoFraccionado(BigDecimal montoNetoFraccionado) {
        this.montoNetoFraccionado = montoNetoFraccionado;
    }

    public BigDecimal getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(BigDecimal montoPago) {
        this.montoPago = montoPago;
    }

    public Long getFinanciamiento() {
        return financiamiento;
    }

    public void setFinanciamiento(Long financiamiento) {
        this.financiamiento = financiamiento;
    }

    public Long getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(Long numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }


    public List<InstallmentFinancingBO> getCuotasFinanciamiento() {
        return cuotasFinanciamiento;
    }

    public void setCuotasFinanciamiento(List<InstallmentFinancingBO> cuotasFinanciamiento) {
        this.cuotasFinanciamiento = cuotasFinanciamiento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinancingBO{");
        sb.append("periodicidad='").append(periodicidad).append('\'');
        sb.append(", financiamiento=").append(financiamiento);
        sb.append(", numeroCuotas=").append(numeroCuotas);
        sb.append(", montoNetoFraccionado=").append(montoNetoFraccionado);
        sb.append(", montoPago=").append(montoPago);
        sb.append(", indicadorDescuentoPrima=").append(indicadorDescuentoPrima);
        sb.append(", fechaInicio='").append(this.getFechaInicio()).append('\'');
        sb.append(", fechaFin='").append(this.getFechaFin()).append('\'');
        sb.append(", cuotasFinanciamiento=").append(cuotasFinanciamiento);
        sb.append('}');
        return sb.toString();
    }
}
