package com.example.codetribe.polokwanetour;

import java.io.Serializable;

/**
 * Created by codetribe on 8/4/2017.
 */

public class Information implements Serializable
{
    private String name;
    private String url;
    private String description;
    private String Address;
    private String Contacts;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContacts() {
        return Contacts;
    }

    public void setContacts(String contacts) {
        Contacts = contacts;
    }
}

