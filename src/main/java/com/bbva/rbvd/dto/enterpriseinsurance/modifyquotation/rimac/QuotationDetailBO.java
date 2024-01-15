package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.rimac;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac.PlanBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotationDetailBO {

    private String fechaCreacion;
    private String fechaExpiracion;
    private String cotizacion;
    private String moneda;
    private String indicadorSeleccionado;
    private String tipoDocumento;
    private String nroDocumento;
    private List<PlanBO> planes;


    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getIndicadorSeleccionado() {
        return indicadorSeleccionado;
    }

    public void setIndicadorSeleccionado(String indicadorSeleccionado) {
        this.indicadorSeleccionado = indicadorSeleccionado;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public List<PlanBO> getPlanes() {
        return planes;
    }

    public void setPlanes(List<PlanBO> planes) {
        this.planes = planes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationDetailBO{");
        sb.append("fechaCreacion='").append(fechaCreacion).append('\'');
        sb.append(", fechaExpiracion='").append(fechaExpiracion).append('\'');
        sb.append(", cotizacion='").append(cotizacion).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", indicadorSeleccionado='").append(indicadorSeleccionado).append('\'');
        sb.append(", tipoDocumento='").append(tipoDocumento).append('\'');
        sb.append(", nroDocumento='").append(nroDocumento).append('\'');
        sb.append(", planes=").append(planes);
        sb.append('}');
        return sb.toString();
    }
}
