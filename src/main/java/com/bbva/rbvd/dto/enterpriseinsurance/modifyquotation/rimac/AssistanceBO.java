package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.rimac;

public class AssistanceBO {

    private Long asistencia;
    private String descripcionAsistencia;


    public Long getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Long asistencia) {
        this.asistencia = asistencia;
    }

    public String getDescripcionAsistencia() {
        return descripcionAsistencia;
    }

    public void setDescripcionAsistencia(String descripcionAsistencia) {
        this.descripcionAsistencia = descripcionAsistencia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AssistanceBO{");
        sb.append("asistencia=").append(asistencia);
        sb.append(", descripcionAsistencia='").append(descripcionAsistencia).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
