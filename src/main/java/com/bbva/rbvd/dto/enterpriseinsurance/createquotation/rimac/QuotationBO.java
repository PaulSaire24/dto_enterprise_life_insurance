package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.rimac;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac.PlanBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotationBO {
    private String cotizacion;
    private String diasVigencia;
    private String fechaFinVigencia;
    private List<PlanBO> plan;

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public String getDiasVigencia() {
        return diasVigencia;
    }

    public void setDiasVigencia(String diasVigencia) {
        this.diasVigencia = diasVigencia;
    }

    public String getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(String fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public List<PlanBO> getPlan() {
        return plan;
    }

    public void setPlan(List<PlanBO> plan) {
        this.plan = plan;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationBO{");
        sb.append(", cotizacion='").append(cotizacion).append('\'');
        sb.append(", diasVigencia='").append(diasVigencia).append('\'');
        sb.append(", fechaFinVigencia='").append(fechaFinVigencia).append('\'');
        sb.append(", planes=").append(plan);
        sb.append('}');
        return sb.toString();
    }
}
