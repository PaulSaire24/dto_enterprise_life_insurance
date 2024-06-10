package com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxBO {

    private String rango;
    private String descripcion;
    private BigDecimal tasa;

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    @Override
    public String toString() {
        return "TaxBO{" +
                "rango='" + rango + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
