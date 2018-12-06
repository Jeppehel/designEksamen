package com.example.demo.domain;

import org.springframework.stereotype.Component;

import java.net.URL;

@Component
public class Kanal {

    private String overskrift;
    private URL url;
    private String Description;

    public Kanal(){

    }

    public Kanal(String overskrift, URL url, String description) {
        this.overskrift = overskrift;
        this.url = url;
        Description = description;
    }

    public String getOverskrift() {
        return overskrift;
    }

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Kanal{" +
                "overskrift='" + overskrift + '\'' +
                ", url=" + url +
                ", Description='" + Description + '\'' +
                '}';
    }
}
