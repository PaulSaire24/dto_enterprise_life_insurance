package com.bbva.rbvd.dto.enterpriseinsurance.mock;

import com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dto.ModifyQuotationDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.rimac.SelectPlanBO;

import java.io.IOException;

public class MockData {
    private static final MockData INSTANCE = new MockData();

    private final ObjectMapperHelper objectMapperHelper;

    private MockData() {objectMapperHelper = ObjectMapperHelper.getInstance();}

    public static MockData getInstance() {
        return INSTANCE;
    }

    public SelectPlanBO getRimacSelectPlanRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/enterpriseinsurance/mock/modifyQuotation/rimacSelectPlanRequest.json"),
                SelectPlanBO.class);
    }

    public SelectPlanBO getRimacSelectPlanResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/enterpriseinsurance/mock/modifyQuotation/rimacSelectPlanResponse.json"),
                SelectPlanBO.class);
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
