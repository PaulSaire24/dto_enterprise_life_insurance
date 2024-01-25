package com.bbva.rbvd.dto.enterpriseinsurance.mock;

import com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dto.ModifyQuotationDTO;

import java.io.IOException;

public class MockData {
    private static final MockData INSTANCE = new MockData();

    private final ObjectMapperHelper objectMapperHelper;

    private MockData() {objectMapperHelper = ObjectMapperHelper.getInstance();}

    public static MockData getInstance() {
        return INSTANCE;
    }

    public ModifyQuotationDTO getRimacSelectPlanRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com.bbva.rbvd.dto.enterpriseinsurance.mock/modifyQuotation/rimacSelectPlanRequestMock.json"),
                ModifyQuotationDTO.class);
    }

    public ModifyQuotationDTO getRimacSelectPlanResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com.bbva.rbvd.dto.enterpriseinsurance.mock/modifyQuotation/rimacSelectPlanResponseMock.json"),
                ModifyQuotationDTO.class);
    }

    public ModifyQuotationDTO getModifyQuotationTransactionInput() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com.bbva.rbvd.dto.enterpriseinsurance.mock/modifyQuotation/inputModifyquotationTransactionMock.json"),
                ModifyQuotationDTO.class);
    }

    public ModifyQuotationDTO getModifyQuotationTransactionOutput() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com.bbva.rbvd.dto.enterpriseinsurance.mock/modifyQuotation/outputModifyquotationTransactionMock.json"),
                ModifyQuotationDTO.class);
    }
}
