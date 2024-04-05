package com.bbva.rbvd.dto.enterpriseinsurance.utils;

public enum RBVDErrors {
    ERROR_PRODUCT_BY_SIMULATION("RBVD00000129", false, "No se encontró información de la cotización"),
    ERROR_SIMULATION_BY_ID("RBVD00000129", false, "No se encontró información de la cotización previa"),
    ERROR_COMPANY_ID_BY_QUOTATION_ID("RBVD01020027", false, "No se encontró información del Id de cotizacion de Rimac"),
    ERROR_RIMAC_RESPONSE_SELECT_PLAN("RBVD01020035",false, "No se obtuvo información del plan seleccionado"),
    ERROR_MODALITIES_FROM_DB_BY_PRODUCT("RBVD01020023",false, "Los planes enviados no son los correctos"),
    ERROR_QUOTATION_SAVING("RBVD01020029",false, "No se pudo registrar la cotización en la tabla [PISD.T_PISD_INSURANCE_QUOTATION]"),
    ERROR_QUOTATION_MOD_SAVING("RBVD01020030",false, "No se pudo registrar la cotización en la tabla [PISD.T_PISD_INSURANCE_QUOTATION_MOD]"),
    ERROR_CALLING_SELECT_PLAN("RBVD01020031",false, "Error al Llamar al Servicio de Seleccionar Plan de Rimac"),
    ERROR_TIMEOUT_RESPONSE("RBVD01020044", false,"Se excedió en el tiempo de espera del servicio de Seleccionar Plan de Rimac"),
    ERROR_CALL_QUOTATION_DETAIL_API("RBVD00000174",false,"Error al llamar al servicio detalle cotizacion de Rimac");

    private final String adviceCode;
    private final boolean rollback;
    private final String message;

    public String getAdviceCode() { return adviceCode; }
    public boolean isRollback() { return rollback; }
    public String getMessage() { return message; }

    RBVDErrors(String adviceCode, boolean rollback, String message) {
        this.adviceCode = adviceCode;
        this.rollback = rollback;
        this.message = message;
    }

}
