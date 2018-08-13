package com.example.veradebora.retrofitcoba.response.ApiResponse;

/**
 * Created by Vera Debora on 7/25/2018.
 */

public class VmDataBean {

    @Override
    public String toString() {
//        return "user name = " + this.user_name + "| host name = " + hostname;
        return "hostname= " + this.hostname + "\n" + "\t\tStatus = " + this.status + "\n" + "\t\tOs= "
                + this.image + "\n\n";


    }


    /**
     * id : 203
     * identifier_vm : dc3452ad5dcfdf7be761059296e27040
     * user_name : Rehan
     * id_user : 41
     * id_vm : 2bb80d1a-ff09-4a28-999e-f038eb77840e
     * ip_vm : 10.14.36.195
     * image : 75a86ebb-ed04-4f13-a9d5-daa5cd8acec2
     * flavor : 2_2_80
     * keypair : not-set
     * hostname : Manusia Pembajak Tuhan
     * usage_purpose : created by system
     * supervisor : created by system
     * supervisor_phone_number : created by system
     * date_request : 2018-07-11 11:40:41
     * status : 2
     * date_approval : default
     * id_admin : 0
     */

    private String id;
    private String identifier_vm;
    private String user_name;
    private String id_user;
    private String id_vm;
    private String ip_vm;
    private String image;
    private String flavor;
    private String keypair;
    private String hostname;
    private String usage_purpose;
    private String supervisor;
    private String supervisor_phone_number;
    private String date_request;
    private String status;
    private String date_approval;
    private String id_admin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentifier_vm() {
        return identifier_vm;
    }

    public void setIdentifier_vm(String identifier_vm) {
        this.identifier_vm = identifier_vm;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_vm() {
        return id_vm;
    }

    public void setId_vm(String id_vm) {
        this.id_vm = id_vm;
    }

    public String getIp_vm() {
        return ip_vm;
    }

    public void setIp_vm(String ip_vm) {
        this.ip_vm = ip_vm;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getKeypair() {
        return keypair;
    }

    public void setKeypair(String keypair) {
        this.keypair = keypair;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getUsage_purpose() {
        return usage_purpose;
    }

    public void setUsage_purpose(String usage_purpose) {
        this.usage_purpose = usage_purpose;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisor_phone_number() {
        return supervisor_phone_number;
    }

    public void setSupervisor_phone_number(String supervisor_phone_number) {
        this.supervisor_phone_number = supervisor_phone_number;
    }

    public String getDate_request() {
        return date_request;
    }

    public void setDate_request(String date_request) {
        this.date_request = date_request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate_approval() {
        return date_approval;
    }

    public void setDate_approval(String date_approval) {
        this.date_approval = date_approval;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

}