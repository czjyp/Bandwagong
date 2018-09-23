package com.czj.bandwagong.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by czj on 2018/9/23.
 */
public class Host extends SuperBean implements Serializable {
    private String name;
    private String ID;
    private String apiKey;

    public Host() {
    }

    public Host(String name, String ID, String apiKey) {

        this.name = name;
        this.ID = ID;
        this.apiKey = apiKey;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Host)) return false;
        Host host = (Host) o;
        return Objects.equals(getName(), host.getName()) &&
                Objects.equals(getID(), host.getID()) &&
                Objects.equals(getApiKey(), host.getApiKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getID(), getApiKey());
    }
}
