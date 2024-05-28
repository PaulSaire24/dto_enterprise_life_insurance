package com.bbva.rbvd.dto.enterpriseinsurance.utils;

public class ConstantsUtil {

    private ConstantsUtil(){}

    public static final class InsuranceSimulation{
        public static final String FIELD_INSRNC_COMPANY_SIMULATION_ID = "INSRNC_COMPANY_SIMULATION_ID";
        public static final String FIELD_INSURANCE_SIMULATION_ID = "INSURANCE_SIMULATION_ID";
        public static final String FIELD_CUSTOMER_SIMULATION_DATE = "CUSTOMER_SIMULATION_DATE";
        public static final String FIELD_CUST_SIMULATION_EXPIRED_DATE = "CUST_SIMULATION_EXPIRED_DATE";
        public static final String FIELD_BANK_FACTOR_TYPE = "BANK_FACTOR_TYPE";
        public static final String FIELD_BANK_FACTOR_AMOUNT = "BANK_FACTOR_AMOUNT";
        public static final String FIELD_REGISTRY_SITUATION_TYPE = "REGISTRY_SITUATION_TYPE";
        public static final String FIELD_BANK_FACTOR_PER = "BANK_FACTOR_PER";


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

    public static final class InsuranceQuoteCoLife{
        public static final String FIELD_INCOMES_PAYROLL_AMOUNT = "INCOMES_PAYROLL_AMOUNT";
        public static final String FIELD_CURRENCY_ID = "CURRENCY_ID";
        public static final String FIELD_PAYROLL_EMPLOYEE_NUMBER = "PAYROLL_EMPLOYEE_NUMBER";
        public static final String FIELD_EMPLOYEE_EMAIL_NAME = "EMPLOYEE_EMAIL_NAME";
        public static final String FIELD_AGE_EMPLOYEES_IND_TYPE = "YEARS_OLD_18_65_EMPLOYEES_IND_TYPE";
        public static final String PAYROLL_CURRENCY_ID = "PAYROLL_CURRENCY_ID";
        public static final String EMPLOYEES_IND_TYPE = "EMPLOYEES_IND_TYPE";


        private InsuranceQuoteCoLife(){}

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
        public static final String QUERY_SELECT_NEXT_VAL_INSURANCE_SIMULATION_ENTERPRISE="PISD.SELECT_NEXT_VAL_INSURANCE_SIMULATION_ENTERPRISE";
        public static final String QUERY_INSERT_INSRNC_SIMLT_PRD_ENTERPRISE="PISD.INSERT_INSRNC_SIMLT_PRD_ENTERPRISE";
        public static final String QUERY_INSERT_SIMULATE_ENTERPRISE="PISD.INSERT_SIMULATE_ENTERPRISE";
        public static final String QUERY_VALIDATE_IF_QUOTATION_MOD_EXISTS="PISD.VALIDATE_IF_QUOTATION_MOD_EXISTS";
        public static final String QUERY_DELETE_QUOTATION_MOD="PISD.DELETE_QUOTATION_MOD";
        public static final String QUERY_GET_QUOTATION_INFO_BY_INTERNAL_ID= "PISD.GET_QUOTATION_INFORMATION_BY_ID";
        public static final String QUERY_INSERT_INSRNC_QUOTE_CO_LIFE= "PISD.INSERT_INSRNC_QUOTE_CO_LIFE";
        public static final String QUERY_DELETE_INSRNC_QUOTE_CO_LIFE= "PISD.DELETE_INSRNC_QUOTE_CO_LIFE";
        public static final String QUERY_VALIDATE_IF_INSRNC_QUOTE_CO_LIFE_EXISTS= "PISD.VALIDATE_IF_QUOTE_CO_LIFE_EXISTS";
        public static final String QUERY_FIND_PAYMENTMETHOD_FROM_QUOTATION = "PISD.FIND_PAYMENTDATA_FROM_QUOTATION";
        public static final String QUERY_FIND_ENTERPRISE_EMPLOYEE_FROM_QUOTATION = "PISD.FIND_ENTERPRISE_EMPLOYEE_FROM_QUOTATION";
        public static final String QUERY_FIND_QUOTATION_DETAIL_BY_QUOTATIONID = "PISD.FIND_QUOTATION_DETAIL_BY_QUOTATIONID";
        public static final String QUERY_UPDATE_PREMIUM_AMOUNT_IN_NORMAL_QUOTATION = "PISD.UPDATE_PREMIUM_AMOUNT_IN_NORMAL_QUOTATION";

        public static final String INSERT_INSRNC_SIMLT_PRD_ENTERPRICE="PISD.INSERT_INSRNC_SIMLT_PRD_ENTERPRISE";
        public static final String INSERT_SIMULATE_ENTERPRICE = "PISD.INSERT_SIMULATE_ENTERPRISE";
        public static final String INSERT_INSURANCE_QUOTATION = "PISD.INSERT_INSURANCE_QUOTATION";
        public static final String GET_MODALITY_TYPE_BY_PRODUCT_ID = "PISD.GET_MODALITY_TYPE_BY_PRODUCT_ID";
        public static final String FIELD_Q_PISD_SIMULATION_ID0_NEXTVAL="NEXTVAL";

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
        public static final String R = "R";
        public static final String C = "C";

        public static final String N = "N";
        public static final String A = "A";
        public static final String ZERO = "0";
        public static final String DATE_PATTERN = "dd/MM/yyyy";
        public static final String OFFICE_NUMBER = "0814";
        public static final String PRODUCT_VIDA_LEY_ID = "842";
        public static final String FLAG_MOCK_SELECT_PLAN = "FLAG_CALL_SELECT_PLAN";
        public static final String FIELD_RESULT_NUMBER = "RESULT_NUMBER";

        public static final String PARTICIPANT_TYPE_HOLDER = "HOLDER";
        public static final String COVERAGE_TYPE_PREFIX = "COVERAGE_TYPE_";
        public static final String COVERAGE_NAME_SUFFIX = "_COVERAGE_NAME";

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

    public static final class PaymentMethod{
        public static final String METHOD_TYPE_DIRECT_DEBIT = "DIRECT_DEBIT";
        public static final String METHOD_TYPE_CREDIT_CARD = "CREDIT_CARD";
        public static final String METHOD_TYPE_SAVINGS_ACCOUNT = "SAVINGS_ACCOUNT";
        public static final String METHOD_TYPE_CURRENT_ACCOUNT = "CURRENT_ACCOUNT";
        public static final String METHPD_TYPE_DEBIT_CARD = "DEBIT_CARD";
        public static final String PRODUCT_ID_CARD = "CARD";
        public static final String PRODUCT_ID_ACCOUNT = "ACCOUNT";

        private PaymentMethod(){}
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
        public static final String FIELD_CAMPAIGN_FACTOR_TYPE = "CAMPAIGN_FACTOR_TYPE";
        public static final String FIELD_CAMPAIGN_OFFER_1_AMOUNT = "CAMPAIGN_OFFER_1_AMOUNT";
        public static final String FIELD_CAMPAIGN_FACTOR_PER = "CAMPAIGN_FACTOR_PER";


        private QuotationModMap(){}

    }

    public static final class QuotationMap{
        public static final String POLICY_QUOTA_INTERNAL_ID = "POLICY_QUOTA_INTERNAL_ID";
        public static final String INSURANCE_SIMULATION_ID = "INSURANCE_SIMULATION_ID";
        public static final String INSURANCE_COMPANY_QUOTA_ID = "INSURANCE_COMPANY_QUOTA_ID";
        public static final String QUOTE_DATE = "QUOTE_DATE";
        public static final String POLICY_QUOTA_END_VALIDITY_DATE = "POLICY_QUOTA_END_VALIDITY_DATE";
        public static final String CUSTOMER_ID = "CUSTOMER_ID";
        public static final String FIELD_INSURED_CUSTOMER_NAME = "INSURED_CUSTOMER_NAME";
        public static final String FIELD_CLIENT_LAST_NAME = "CLIENT_LAST_NAME";
        public static final String FIELD_CUSTOMER_SEGMENT_NAME = "CUSTOMER_SEGMENT_NAME";
        public static final String FIELD_POLICY_QUOTA_STATUS_TYPE = "POLICY_QUOTA_STATUS_TYPE";
        public static final String FIELD_RFQ_INTERNAL_ID = "RFQ_INTERNAL_ID";
        public static final String PERSONAL_DOC_TYPE = "PERSONAL_DOC_TYPE";
        public static final String PARTICIPANT_PERSONAL_ID = "PARTICIPANT_PERSONAL_ID";
        public static final String LAST_CHANGE_BRANCH_ID = "LAST_CHANGE_BRANCH_ID";
        public static final String SOURCE_BRANCH_ID = "SOURCE_BRANCH_ID";
        public static final String CREATION_USER_ID = "CREATION_USER_ID";
        public static final String USER_AUDIT_ID = "USER_AUDIT_ID";

        private QuotationMap(){}
    }

    public static final class InsuranceContract{
        private InsuranceContract(){}

        public static final String FIELD_AUTOMATIC_DEBIT_INDICATOR_TYPE = "AUTOMATIC_DEBIT_INDICATOR_TYPE";
        public static final String FIELD_PAYMENT_FREQUENCY_NAME = "PAYMENT_FREQUENCY_NAME";
        public static final String FIELD_DOMICILE_CONTRACT_ID = "DOMICILE_CONTRACT_ID";
        public static final String FIELD_PAYMENT_METHOD_TYPE = "PAYMENT_METHOD_TYPE";
        public static final String FIELD_INSURANCE_CONTRACT_ENTITY_ID = "INSURANCE_CONTRACT_ENTITY_ID";
        public static final String FIELD_CONTRACT_MANAGER_BRANCH_ID = "CONTRACT_MANAGER_BRANCH_ID";
        public static final String FIELD_INSURANCE_CONTRACT_BRANCH_ID = "INSURANCE_CONTRACT_BRANCH_ID";
        public static final String FIELD_INSURED_AMOUNT = "INSURED_AMOUNT";
        public static final String FIELD_CURRENCY_ID = "CURRENCY_ID";
    }


    public static final class HeaderSignatureAWS{
        public static final String AUTHORIZATION = "Authorization";
        public static final String X_AMZ_DATE = "X-Amz-Date";
        public static final String X_API_KEY = "x-api-key";
        public static final String TRACEID = "traceId";

        private HeaderSignatureAWS(){}

    }
    
    public static final class QuotationDetailRimac{
        public static final String KEY_URI_FROM_CONSOLE = "rimac.quotationdetail.enterprise.uri";
        public static final String PATH_PARAM_EXTERNAL_QUOTATION_ID = "externalQuotationId";
        public static final String PATH_PARAM_PRODUCT_NAME = "productName";
        public static final String QUERY_PARAM_QUOTATION_TYPE = "quotationType";
        public static final String QUERY_STRING_TIPO_COTIZACION = "tipoCotizacion=";
        public static final String KEY_RIMAC_SERVICE = "quotationdetail.enterprise.life";

        private QuotationDetailRimac(){}

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
