package com.bbva.rbvd.dto.enterpriseinsurance.utils;

public class ConstantsUtil {

    private ConstantsUtil(){}

    public static final class InsuranceSimulation{
        public static final String FIELD_INSRNC_COMPANY_SIMULATION_ID = "INSRNC_COMPANY_SIMULATION_ID";
        public static final String FIELD_INSURANCE_SIMULATION_ID = "INSURANCE_SIMULATION_ID";

        private InsuranceSimulation(){}

    }

    public static final class InsuranceProduct{
        public static final String FIELD_PRODUCT_SHORT_DESC = "PRODUCT_SHORT_DESC";
        public static final String FIELD_INSURANCE_PRODUCT_TYPE = "INSURANCE_PRODUCT_TYPE";
        public static final String FIELD_INSURANCE_PRODUCT_BUSINESS_NAME = "INSURANCE_BUSINESS_NAME";


        private InsuranceProduct(){}
    }

    public static final class InsurancePrdModality{
        public static final String FIELD_INSURANCE_COMPANY_MODALITY_ID = "INSURANCE_COMPANY_MODALITY_ID";
        public static final String FIELD_INSURANCE_PRODUCT_ID = "INSURANCE_PRODUCT_ID";
        public static final String FIELD_INSURANCE_MODALITY_TYPE = "INSURANCE_MODALITY_TYPE";
        public static final String FIELD_SALE_CHANNEL_ID = "SALE_CHANNEL_ID";

        private InsurancePrdModality(){}

    }

    public static final class QueriesName{
        public static final String QUERY_SELECT_PRODUCT_BY_PRODUCT_TYPE = "PISD.SELECT_PRODUCT_BY_PRODUCT_TYPE";
        public static final String QUERY_GET_COMPANY_QUOTA_ID_AND_PRODUCT_SHORT_DESC = "PISD.GET_RIMAC_QUOT_AND_PRODUCT_INFO_BY_POLICY_QUOTA_INTERNAL_ID";
        public static final String QUERY_COMPANY_MODALITIES_BY_PRODUCT_AND_CHANNEL = "PISD.GET_COMPANY_MODALITIES_BY_PRODUCT_AND_CHANNEL";
        public static final String QUERY_SIMULATION_BY_COMPANY_ID = "PISD.GET_SIMULATION_BY_COMPANY_SIMULATION_ID";
        public static final String QUERY_INSERT_INSURANCE_QUOTATION= "PISD.INSERT_INSURANCE_QUOTATION";
        public static final String QUERY_INSERT_INSURANCE_QUOTATION_MOD= "PISD.INSERT_INSURANCE_QUOTATION_MOD";
        public static final String QUERY_SELECT_PRODUCT_BY_COMPANY_SIMULATION_ID= "PISD.SELECT_PRODUCT_BY_COMPANY_SIMULATION_ID";
        public static final String QUERY_GET_SIMULATION_BY_COMPANY_SIMULATION_ID="PISD.GET_SIMULATION_BY_COMPANY_SIMULATION_ID";
        public static final String QUERY_SELECT_INSURANCE_SIMULATION_ID_ENTERPRISE="PISD.SELECT_INSURANCE_SIMULATION_ID_ENTERPRISE";
        public static final String QUERY_INSERT_INSRNC_SIMLT_PRD_ENTERPRISE="PISD.INSERT_INSRNC_SIMLT_PRD_ENTERPRISE";
        public static final String QUERY_INSERT_SIMULATE_ENTERPRISE="PISD.INSERT_SIMULATE_ENTERPRISE";
        public static final String QUERY_VALIDATE_IF_QUOTATION_MOD_EXISTS="PISD.VALIDATE_IF_QUOTATION_MOD_EXISTS";
        public static final String QUERY_DELETE_QUOTATION_MOD="PISD.DELETE_QUOTATION_MOD";
        public static final String QUERY_GET_PRODUCT_INFO_BY_INTERNAL_ID_AND_PRODUCT_TYPE = "PISD.GET_PRODUCT_INFO_BY_INTERNAL_ID_AND_PRODUCT_TYPE";
        public static final String QUERY_GET_QUOTATION_INFO_BY_INTERNAL_ID= "PISD.GET_QUOTATION_INFORMATION_BY_ID";


        private QueriesName(){}


    }

    public static final class NumberConstants{
        public static final int ONE = 1;
        public static final int ZERO = 0;
        public static final int NINE = 9;

        private NumberConstants(){}

    }

    public static final class StringConstants{
        public static final String S = "S";
        public static final String D = "D";

        public static final String N = "N";
        public static final String A = "A";
        public static final String ZERO = "0";
        public static final String DATE_PATTERN = "dd/MM/yyyy";
        public static final String OFFICE_NUMBER = "0814";
        public static final String PRODUCT_VIDA_LEY_ID = "842";
        public static final String FLAG_MOCK_SELECT_PLAN = "FLAG_CALL_SELECT_PLAN";
        public static final String FIELD_RESULT_NUMBER = "RESULT_NUMBER";
        private StringConstants(){}

    }


    public static final class FinancingPeriodicity{
        public static final String ANUAL = "Anual";
        public static final String MENSUAL = "Mensual";

        private FinancingPeriodicity(){}

    }

    public static final class ContactDetailtype{
        public static final String MOBILE = "MOBILE";
        public static final String EMAIL = "EMAIL";

        private ContactDetailtype(){}

    }

    public static final class QuotationModMap{
        public static final String POLICY_QUOTA_INTERNAL_ID = "POLICY_QUOTA_INTERNAL_ID";
        public static final String INSURANCE_PRODUCT_ID = "INSURANCE_PRODUCT_ID";
        public static final String SALE_CHANNEL_ID = "SALE_CHANNEL_ID";
        public static final String PAYMENT_TERM_NUMBER = "PAYMENT_TERM_NUMBER";
        public static final String POLICY_PAYMENT_FREQUENCY_TYPE = "POLICY_PAYMENT_FREQUENCY_TYPE";
        public static final String FINANCING_START_DATE = "FINANCING_START_DATE";
        public static final String FINANCING_END_DATE = "FINANCING_END_DATE";
        public static final String PREMIUM_AMOUNT = "PREMIUM_AMOUNT";
        public static final String PREMIUM_CURRENCY_ID = "PREMIUM_CURRENCY_ID";
        public static final String SAVED_QUOTATION_IND_TYPE = "SAVED_QUOTATION_IND_TYPE";
        public static final String LAST_CHANGE_BRANCH_ID = "LAST_CHANGE_BRANCH_ID";
        public static final String SOURCE_BRANCH_ID = "SOURCE_BRANCH_ID";
        public static final String CREATION_USER_ID = "CREATION_USER_ID";
        public static final String USER_AUDIT_ID = "USER_AUDIT_ID";
        public static final String CONTACT_EMAIL_DESC = "CONTACT_EMAIL_DESC";
        public static final String CUSTOMER_PHONE_DESC = "CUSTOMER_PHONE_DESC";
        public static final String DATA_TREATMENT_IND_TYPE = "DATA_TREATMENT_IND_TYPE";

        private QuotationModMap(){}

    }

    public static final class QuotationMap{
        public static final String POLICY_QUOTA_INTERNAL_ID = "POLICY_QUOTA_INTERNAL_ID";
        public static final String INSURANCE_SIMULATION_ID = "INSURANCE_SIMULATION_ID";
        public static final String INSURANCE_COMPANY_QUOTA_ID = "INSURANCE_COMPANY_QUOTA_ID";
        public static final String QUOTE_DATE = "QUOTE_DATE";
        public static final String POLICY_QUOTA_END_VALIDITY_DATE = "POLICY_QUOTA_END_VALIDITY_DATE";
        public static final String CUSTOMER_ID = "CUSTOMER_ID";
        public static final String PERSONAL_DOC_TYPE = "PERSONAL_DOC_TYPE";
        public static final String PARTICIPANT_PERSONAL_ID = "PARTICIPANT_PERSONAL_ID";
        public static final String LAST_CHANGE_BRANCH_ID = "LAST_CHANGE_BRANCH_ID";
        public static final String SOURCE_BRANCH_ID = "SOURCE_BRANCH_ID";
        public static final String CREATION_USER_ID = "CREATION_USER_ID";
        public static final String USER_AUDIT_ID = "USER_AUDIT_ID";

        private QuotationMap(){}
    }


    public static final class HeaderSignatureAWS{
        public static final String AUTHORIZATION = "Authorization";
        public static final String X_AMZ_DATE = "X-Amz-Date";
        public static final String X_API_KEY = "x-api-key";
        public static final String TRACEID = "traceId";

        private HeaderSignatureAWS(){}

    }

    public static final class SelectPlanRimac{
        public static final String RIMAC_QUOTATION = "externalQuotationId";
        public static final String KEY_CONSOLE = "enterprise.quotation.modify";

        private SelectPlanRimac(){}
    }

    public static final class Flags{
        public static final String FLAG_CALL_SELECT_PLAN = "FLAG_CALL_SELECT_PLAN";

        private Flags(){}

    }



}
