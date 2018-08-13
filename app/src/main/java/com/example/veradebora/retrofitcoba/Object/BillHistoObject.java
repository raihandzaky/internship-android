package com.example.veradebora.retrofitcoba.Object;

/**
 * Created by Vera Debora on 8/8/2018.
 */

public class BillHistoObject {
    private String Hostname;
    private String Status;
    private String PricePerHour;
    private String Flavor;

    public BillHistoObject(String hostname, String status, String pricePerHour, String flavor, String total) {
        Hostname = hostname;
        Status = status;
        PricePerHour = pricePerHour;
        Flavor = flavor;
        Total = total;
    }

    public String getHostname() {

        return Hostname;
    }

    public void setHostname(String hostname) {
        Hostname = hostname;
    }

    public String getStatus() {
        switch (Status){
            case "1":
                return "Running";
        }
        return null;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getPricePerHour() {
        return PricePerHour;
    }

    public void setPricePerHour(String pricePerHour) {
        PricePerHour = pricePerHour;
    }

    public String getFlavor() {
        switch (Flavor){
            case "1_1_20":
                return "1 VCPUs \n" +
                        "1 GB RAM \n" +
                        "20 GB Disk";

            case "1_1_40":
                return "1 VCPUs \n" +
                        "1 GB RAM \n" +
                        "40 GB Disk";

            case "1_1_80":
                return "1 VCPUs \n" +
                        "1 GB RAM \n" +
                        "80 GB Disk";

            case "1_2_20":
                return "1 VCPUs \n" +
                        "2 GB RAM \n" +
                        "20 GB Disk";

            case "1_2_40":
                return "1 VCPUs \n" +
                        "2 GB RAM \n" +
                        "40 GB Disk";

            case "1_2_80":
                return "1 VCPUs \n" +
                        "2 GB RAM \n" +
                        "80 GB Disk";

            case "1_4_20":
                return "1 VCPUs \n" +
                        "4 GB RAM \n" +
                        "20 GB Disk";

            case "1_4_40":
                return "1 VCPUs \n" +
                        "4 GB RAM \n" +
                        "40 GB Disk";

            case "1_4_80":
                return "1 VCPUs \n" +
                        "4 GB RAM \n" +
                        "80 GB Disk";

            case "2_1_20":
                return "2 VCPUs \n" +
                        "1 GB RAM \n" +
                        "20 GB Disk";

            case "2_1_40":
                return "2 VCPUs \n" +
                        "1 GB RAM \n" +
                        "40 GB Disk";

            case "2_1_80":
                return "2 VCPUs \n" +
                        "1 GB RAM \n" +
                        "80 GB Disk";

            case "2_2_20":
                return "2 VCPUs \n" +
                        "2 GB RAM \n" +
                        "20 GB Disk";

            case "2_2_40":
                return "2 VCPUs \n" +
                        "2 GB RAM \n" +
                        "40 GB Disk";

            case "2_2_80":
                return "2 VCPUs \n" +
                        "2 GB RAM \n" +
                        "80 GB Disk";

            case "2_4_20":
                return "2 VCPUs \n" +
                        "4 GB RAM \n" +
                        "20 GB Disk";

            case "2_4_40":
                return "2 VCPUs \n" +
                        "4 GB RAM \n" +
                        "40 GB Disk";

            case "2_4_80":
                return "2 VCPUs \n" +
                        "4 GB RAM \n" +
                        "80 GB Disk";

        }

        return null;
    }

    public void setFlavor(String flavor) {
        Flavor = flavor;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    private String Total;
}
