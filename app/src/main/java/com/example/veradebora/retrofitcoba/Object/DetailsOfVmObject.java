package com.example.veradebora.retrofitcoba.Object;

/**
 * Created by Vera Debora on 8/6/2018.
 */

public class DetailsOfVmObject {

    private String flavor;
    private String  IpAddress;

    public DetailsOfVmObject(String flavor, String ipAddress) {
        this.flavor = flavor;
        this.IpAddress = ipAddress;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getIpAddress() {
        return IpAddress;
    }

    public void setIpAddress(String ipAddress) {
        IpAddress = ipAddress;
    }

}
