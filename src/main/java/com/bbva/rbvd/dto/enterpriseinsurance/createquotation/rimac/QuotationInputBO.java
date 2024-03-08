package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.rimac;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ContractorDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac.ParticularDataBO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac.PlanBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotationInputBO {
    private String producto;
    private String moneda;
    private List<Long> planes;
    private String tipoCotizacion;
    private List<ParticularDataBO> datosParticulares;
    private ContractorDTO contratante;

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

    public String getTipoCotizacion() {
        return tipoCotizacion;
    }

    public void setTipoCotizacion(String tipoCotizacion) {
        this.tipoCotizacion = tipoCotizacion;
    }

    public ContractorDTO getContratante() {
        return contratante;
    }

    public void setContratante(ContractorDTO contratante) {
        this.contratante = contratante;
    }

    public List<Long> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Long> planes) {
        this.planes = planes;
    }

    public List<ParticularDataBO> getDatosParticulares() {
        return datosParticulares;
    }

    public void setDatosParticulares(List<ParticularDataBO> datosParticulares) {
        this.datosParticulares = datosParticulares;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationResponseBO{");
        sb.append(", producto='").append(producto).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", planes='").append(planes).append('\'');
        sb.append(", tipoCotizacion='").append(tipoCotizacion).append('\'');
        sb.append(", contratante=").append(contratante).append('\'');
        sb.append(", datosParticulares=").append(datosParticulares).append('\'');

        sb.append('}');
        return sb.toString();
    }
}
