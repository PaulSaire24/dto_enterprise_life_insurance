package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.rimac;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InstallmentFinancingBO {

    private Long cuota;
    private BigDecimal monto;
    private String fechaVencimiento;
    private  String moneda;

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Long getCuota() {
        return cuota;
    }

    public void setCuota(Long cuota) {
        this.cuota = cuota;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentFinancingBO{");
        sb.append("cuota=").append(cuota);
        sb.append(", monto=").append(monto);
        sb.append(", moneda=").append(moneda);
        sb.append(", fechaVencimiento='").append(fechaVencimiento).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
