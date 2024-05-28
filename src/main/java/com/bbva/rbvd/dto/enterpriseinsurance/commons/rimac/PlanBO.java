package com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanBO extends CommonsBO{

    private Long plan;
    private String descripcionPlan;
    private BigDecimal primaNeta;
    private BigDecimal primaBruta;
    private List<FinancingBO> financiamientos;
    private List<CoverageBO> coberturas;
    private List<ParticularDataBO> datosParticulares;
    private List<AssistanceBO> asistencias;
    private String moneda;
    private BigDecimal montoIGV;
    private BigDecimal tasa;
    private BigDecimal remuneracionMaximaAsegurable;


    public Long getPlan() {
        return plan;
    }

    public void setPlan(Long plan) {
        this.plan = plan;
    }

    public String getDescripcionPlan() {
        return descripcionPlan;
    }

    public void setDescripcionPlan(String descripcionPlan) {
        this.descripcionPlan = descripcionPlan;
    }

    public BigDecimal getPrimaNeta() {
        return primaNeta;
    }

    public void setPrimaNeta(BigDecimal primaNeta) {
        this.primaNeta = primaNeta;
    }

    public BigDecimal getPrimaBruta() {
        return primaBruta;
    }

    public void setPrimaBruta(BigDecimal primaBruta) {
        this.primaBruta = primaBruta;
    }

    public List<FinancingBO> getFinanciamientos() {
        return financiamientos;
    }

    public void setFinanciamientos(List<FinancingBO> financiamientos) {
        this.financiamientos = financiamientos;
    }

    public List<CoverageBO> getCoberturas() {
        return coberturas;
    }

    public void setCoberturas(List<CoverageBO> coberturas) {
        this.coberturas = coberturas;
    }

    public List<ParticularDataBO> getDatosParticulares() {
        return datosParticulares;
    }

    public void setDatosParticulares(List<ParticularDataBO> datosParticulares) {
        this.datosParticulares = datosParticulares;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public List<AssistanceBO> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<AssistanceBO> asistencias) {
        this.asistencias = asistencias;
    }

    public BigDecimal getMontoIGV() {
        return montoIGV;
    }

    public void setMontoIGV(BigDecimal montoIGV) {
        this.montoIGV = montoIGV;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public BigDecimal getRemuneracionMaximaAsegurable() {
        return remuneracionMaximaAsegurable;
    }

    public void setRemuneracionMaximaAsegurable(BigDecimal remuneracionMaximaAsegurable) {
        this.remuneracionMaximaAsegurable = remuneracionMaximaAsegurable;
    }

    @Override
    public String toString() {
        return "PlanBO{" +
                "plan=" + plan +
                ", descripcionPlan='" + descripcionPlan + '\'' +
                ", primaNeta=" + primaNeta +
                ", primaBruta=" + primaBruta +
                ", financiamientos=" + financiamientos +
                ", coberturas=" + coberturas +
                ", datosParticulares=" + datosParticulares +
                ", asistencias=" + asistencias +
                ", moneda='" + moneda + '\'' +
                ", montoIGV=" + montoIGV +
                ", tasa=" + tasa +
                ", remuneracionMaximaAsegurable=" + remuneracionMaximaAsegurable +
                '}';
    }

}
