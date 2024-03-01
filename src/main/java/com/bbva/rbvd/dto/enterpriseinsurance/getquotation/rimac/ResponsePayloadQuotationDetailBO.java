package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.rimac;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac.PlanBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePayloadQuotationDetailBO {

    private String cotizacion;
    private String diasVigencia;
    private String fechaFinVigencia;
    private PlanBO plan;
    private String producto;
    private String moneda;
    private List<Long> planes;


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

    public PlanBO getPlan() {
        return plan;
    }

    public void setPlan(PlanBO plan) {
        this.plan = plan;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public List<Long> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Long> planes) {
        this.planes = planes;
    }


    @Override
    public String toString() {
        return "ResponsePayloadQuotationDetailBO{" +
                "cotizacion='" + cotizacion + '\'' +
                ", diasVigencia='" + diasVigencia + '\'' +
                ", fechaFinVigencia='" + fechaFinVigencia + '\'' +
                ", plan=" + plan +
                ", producto='" + producto + '\'' +
                ", moneda='" + moneda + '\'' +
                ", planes=" + planes +
                '}';
    }
}
