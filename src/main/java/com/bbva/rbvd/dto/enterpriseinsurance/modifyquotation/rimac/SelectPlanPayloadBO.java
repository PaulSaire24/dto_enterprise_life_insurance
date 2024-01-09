package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.rimac;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectPlanPayloadBO {

    private String producto;
    private List<PlanBO> planes;
    private List<ParticularDataBO> datosParticulares;
    private String codigoExterno;

    private Integer status;
    private String mensaje;
    private List<QuotationDetailBO> detalleCotizacion;


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public List<PlanBO> getPlanes() {
        return planes;
    }

    public void setPlanes(List<PlanBO> planes) {
        this.planes = planes;
    }

    public List<ParticularDataBO> getDatosParticulares() {
        return datosParticulares;
    }

    public void setDatosParticulares(List<ParticularDataBO> datosParticulares) {
        this.datosParticulares = datosParticulares;
    }

    public String getCodigoExterno() {
        return codigoExterno;
    }

    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<QuotationDetailBO> getDetalleCotizacion() {
        return detalleCotizacion;
    }

    public void setDetalleCotizacion(List<QuotationDetailBO> detalleCotizacion) {
        this.detalleCotizacion = detalleCotizacion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SelectPlanPayloadBO{");
        sb.append("producto='").append(producto).append('\'');
        sb.append(", planes=").append(planes);
        sb.append(", datosParticulares=").append(datosParticulares);
        sb.append(", codigoExterno='").append(codigoExterno).append('\'');
        sb.append(", status=").append(status);
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", detalleCotizacion=").append(detalleCotizacion);
        sb.append('}');
        return sb.toString();
    }
}
