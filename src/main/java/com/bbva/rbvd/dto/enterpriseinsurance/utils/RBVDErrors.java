package com.bbva.rbvd.dto.enterpriseinsurance.utils;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

public enum RBVDErrors {
    ERROR_PRODUCT_BY_SIMULATION("RBVD00000129", false, "No se encontro informacion de la cotizacion"),
    ERROR_SIMULATION_BY_ID("RBVD00000129", false, "No se encontro informacion de la cotizacion previa"),
    ERROR_RIMAC_RESPONSE_SELECT_PLAN("RBVD01020035",false, "No se obtuvo informacion del plan seleccionado"),
    ERROR_MODALITIES_FROM_DB_BY_PRODUCT("RBVD01020023",false, "Los planes enviados no son los correctos"),
    ERROR_QUOTATION_SAVING("RBVD01020029",false, "No se pudo registrar la cotización en la tabla [PISD.T_PISD_INSURANCE_QUOTATION]"),
    ERROR_QUOTATION_MOD_SAVING("RBVD01020030",false, "No se pudo registrar la cotización en la tabla [PISD.T_PISD_INSURANCE_QUOTATION_MOD]"),
    ERROR_CALLING_SELECT_PLAN("RBVD01020030",false, "Error al Llamar al Servicio de Seleccionar Plan de Rimac"),
    ERROR_TIMEOUT_RESPONSE("RBVD01020044", false,"Se excedio en el tiempo de espera del servicio de Seleccionar Plan de Rimac");

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
