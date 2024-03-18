package com.bbva.rbvd.dto.enterpriseinsurance.commons.rimac;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoverageBO {

    private Long cobertura;
    private String descripcionCobertura;
    private String tipoCobertura;
    private BigDecimal primaBruta;
    private BigDecimal primaNeta;
    private String moneda;
    private String principal;
    private BigDecimal sumaAsegurada;
    private String porcentajeSeleccionado;
    private String observacionCobertura;
    private String condicion;
    private String indSeleccionar;
    private Long edadMinima;
    private Long edadMaxima;
    private Long edadPermanecia;
    private Long numeroSueldos;

    public Long getCobertura() {
        return cobertura;
    }

    public void setCobertura(Long cobertura) {
        this.cobertura = cobertura;
    }

    public String getDescripcionCobertura() {
        return descripcionCobertura;
    }

    public void setDescripcionCobertura(String descripcionCobertura) {
        this.descripcionCobertura = descripcionCobertura;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getIndSeleccionar() {
        return indSeleccionar;
    }

    public void setIndSeleccionar(String indSeleccionar) {
        this.indSeleccionar = indSeleccionar;
    }

    public Long getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Long edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Long getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Long edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public Long getEdadPermanecia() {
        return edadPermanecia;
    }

    public void setEdadPermanecia(Long edadPermanecia) {
        this.edadPermanecia = edadPermanecia;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public BigDecimal getPrimaBruta() {
        return primaBruta;
    }

    public void setPrimaBruta(BigDecimal primaBruta) {
        this.primaBruta = primaBruta;
    }

    public BigDecimal getPrimaNeta() {
        return primaNeta;
    }

    public void setPrimaNeta(BigDecimal primaNeta) {
        this.primaNeta = primaNeta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(BigDecimal sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public String getPorcentajeSeleccionado() {
        return porcentajeSeleccionado;
    }

    public void setPorcentajeSeleccionado(String porcentajeSeleccionado) {
        this.porcentajeSeleccionado = porcentajeSeleccionado;
    }

    public Long getNumeroSueldos() {
        return numeroSueldos;
    }

    public void setNumeroSueldos(Long numeroSueldos) {
        this.numeroSueldos = numeroSueldos;
    }

    public String getObservacionCobertura() {
        return observacionCobertura;
    }

    public void setObservacionCobertura(String observacionCobertura) {
        this.observacionCobertura = observacionCobertura;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageBO{");
        sb.append("cobertura=").append(cobertura);
        sb.append(", descripcionCobertura='").append(descripcionCobertura).append('\'');
        sb.append(", tipoCobertura='").append(tipoCobertura).append('\'');
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", primaNeta=").append(primaNeta);
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", sumaAsegurada=").append(sumaAsegurada);
        sb.append(", porcentajeSeleccionado='").append(porcentajeSeleccionado).append('\'');
        sb.append(", observacionCobertura='").append(observacionCobertura).append('\'');
        sb.append(", condicion='").append(condicion).append('\'');
        sb.append(", principal=").append(principal);
        sb.append(", indSeleccionar='").append(indSeleccionar).append('\'');
        sb.append(", edadMinima='").append(edadMinima).append('\'');
        sb.append(", edadMaxima='").append(edadMaxima).append('\'');
        sb.append(", edadPermanecia='").append(edadPermanecia).append('\'');
        sb.append(", numeroSueldos='").append(numeroSueldos).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
