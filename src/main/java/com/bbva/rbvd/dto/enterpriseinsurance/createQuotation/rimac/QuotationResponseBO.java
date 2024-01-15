package com.bbva.rbvd.dto.enterpriseinsurance.createQuotation.rimac;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac.FinancingBO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac.ParticularDataBO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac.PlanBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotationResponseBO {
    private String producto;
    private String moneda;
    private List<PlanBO> planes;
    private QuotationBO cotizaciones;
    private ParticularDataBO datosParticulares;
    private FinancingBO financiamiento;

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

    public List<PlanBO> getPlanes() {
        return planes;
    }

    public void setPlanes(List<PlanBO> planes) {
        this.planes = planes;
    }

    public QuotationBO getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(QuotationBO cotizaciones) {
        this.cotizaciones = cotizaciones;
    }

    public ParticularDataBO getDatosParticulares() {
        return datosParticulares;
    }

    public void setDatosParticulares(ParticularDataBO datosParticulares) {
        this.datosParticulares = datosParticulares;
    }

    public FinancingBO getFinanciamiento() {
        return financiamiento;
    }

    public void setFinanciamiento(FinancingBO financiamiento) {
        this.financiamiento = financiamiento;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationResponseBO{");
        sb.append(", producto='").append(producto).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", planes='").append(planes).append('\'');
        sb.append(", cotizaciones=").append(cotizaciones).append('\'');
        sb.append(", datosParticulares=").append(datosParticulares).append('\'');
        sb.append(", financiamiento=").append(financiamiento);
        sb.append('}');
        return sb.toString();
    }
}
