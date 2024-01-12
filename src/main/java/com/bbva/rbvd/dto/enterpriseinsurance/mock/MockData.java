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
                        "com/bbva/rbvd/dto/enterpriseinsurance/mock/modifyQuotation/rimacSelectPlanRequest.json"),
                ModifyQuotationDTO.class);
    }

    public ModifyQuotationDTO getRimacSelectPlanResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/enterpriseinsurance/mock/modifyQuotation/rimacSelectPlanResponse.json"),
                ModifyQuotationDTO.class);
    }

    public ModifyQuotationDTO getTransactionRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/enterpriseinsurance/mock/modifyQuotation/rimacTransactionRequest.json"),
                ModifyQuotationDTO.class);
    }

    public ModifyQuotationDTO getTransactionResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/enterpriseinsurance/mock/modifyQuotation/rimacTransactionResponse.json"),
                ModifyQuotationDTO.class);
    }
}
