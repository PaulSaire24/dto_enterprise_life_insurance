package com.bbva.rbvd.dto.enterpriseinsurance.utils;

public class ConstantsUtil {

    private ConstantsUtil(){}

    public static final class InsuranceSimulation{
        public static final String FIELD_INSRNC_COMPANY_SIMULATION_ID = "INSRNC_COMPANY_SIMULATION_ID";
        public static final String FIELD_INSURANCE_SIMULATION_ID = "INSURANCE_SIMULATION_ID";

    }

    public static final class InsuranceProduct{
        public static final String FIELD_PRODUCT_SHORT_DESC = "PRODUCT_SHORT_DESC";
        public static final String FIELD_INSURANCE_PRODUCT_TYPE = "INSURANCE_PRODUCT_TYPE";
    }

    public static final class InsurancePrdModality{
        public static final String FIELD_INSURANCE_COMPANY_MODALITY_ID = "INSURANCE_COMPANY_MODALITY_ID";
        public static final String FIELD_INSURANCE_PRODUCT_ID = "INSURANCE_PRODUCT_ID";
        public static final String FIELD_INSURANCE_MODALITY_TYPE = "INSURANCE_MODALITY_TYPE";
        public static final String FIELD_SALE_CHANNEL_ID = "SALE_CHANNEL_ID";

    }

    public static final class QueriesName{
        public static final String QUERY_SELECT_PRODUCT_BY_PRODUCT_TYPE = "PISD.SELECT_PRODUCT_BY_PRODUCT_TYPE";
        public static final String QUERY_COMPANY_MODALITIES_BY_PRODUCT_AND_CHANNEL = "PISD.GET_COMPANY_MODALITIES_BY_PRODUCT_AND_CHANNEL";
        public static final String QUERY_SIMULATION_BY_COMPANY_ID = "PISD.GET_SIMULATION_BY_COMPANY_SIMULATION_ID";
    }

    public static final class HeaderSignatureAWS{
        public static final String AUTHORIZATION = "Authorization";
        public static final String X_AMZ_DATE = "X-Amz-Date";
        public static final String X_API_KEY = "x-api-key";
        public static final String TRACEID = "traceId";

    }

    public static final class SelectPlanRimac{

        public static final String RIMAC_QUOTATION = "externalQuotationId";
        public static final String KEY_CONSOLE = "enterprise.quotation.modify";

    }



}
