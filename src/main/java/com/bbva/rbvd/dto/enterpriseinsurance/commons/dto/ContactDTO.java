package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class ContactDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private String contactDetailType;
    private String number;
    private String address;

    public String getContactDetailType() {
        return contactDetailType;
    }

    public void setContactDetailType(String contactDetailType) {
        this.contactDetailType = contactDetailType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactDTO{" +
                "contactDetailType='" + contactDetailType + '\'' +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
