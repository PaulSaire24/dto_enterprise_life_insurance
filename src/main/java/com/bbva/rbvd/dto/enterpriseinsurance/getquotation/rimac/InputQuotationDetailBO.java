package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.rimac;

public class InputQuotationDetailBO {

    private String cotizacion;
    private String producto;
    private String tipoCotizacion;
    private String traceId;


    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTipoCotizacion() {
        return tipoCotizacion;
    }

    public void setTipoCotizacion(String tipoCotizacion) {
        this.tipoCotizacion = tipoCotizacion;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @Override
    public String toString() {
        return "InputQuotationDetailBO{" +
                "cotizacion='" + cotizacion + '\'' +
                ", producto='" + producto + '\'' +
                ", tipoCotizacion='" + tipoCotizacion + '\'' +
                ", traceId='" + traceId + '\'' +
                '}';
    }
}
