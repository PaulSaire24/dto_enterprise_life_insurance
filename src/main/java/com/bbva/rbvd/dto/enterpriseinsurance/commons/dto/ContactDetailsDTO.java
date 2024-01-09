package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class ContactDetailsDTO implements Serializable {
    private static final long serialVersionUID = 1L;

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
