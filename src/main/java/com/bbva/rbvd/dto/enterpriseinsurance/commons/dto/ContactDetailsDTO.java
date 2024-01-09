package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

public class ContactDetailsDTO extends CommonFieldsDTO {
    private  ContactDTO contact;

    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ContactDetailsDTO{" +
                "contact=" + contact +
                '}';
    }
}
