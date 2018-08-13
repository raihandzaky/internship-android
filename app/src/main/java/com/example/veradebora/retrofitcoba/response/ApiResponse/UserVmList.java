package com.example.veradebora.retrofitcoba.response.ApiResponse;

import java.util.List;

/**
 * Created by Vera Debora on 7/11/2018.
 */

public class UserVmList {

    /**
     * result : true
     * message : vm data found
     * vm_data : [{"id":"203","identifier_vm":"dc3452ad5dcfdf7be761059296e27040","user_name":"Rehan","id_user":"41","id_vm":"2bb80d1a-ff09-4a28-999e-f038eb77840e","ip_vm":"10.14.36.195","image":"75a86ebb-ed04-4f13-a9d5-daa5cd8acec2","flavor":"2_2_80","keypair":"not-set","hostname":"Manusia Pembajak Tuhan","usage_purpose":"created by system","supervisor":"created by system","supervisor_phone_number":"created by system","date_request":"2018-07-11 11:40:41","status":"2","date_approval":"default","id_admin":"0"},{"id":"190","identifier_vm":"f239689c86eafe6eaf83d19fad2c0640","user_name":"Rehan","id_user":"41","id_vm":"default","ip_vm":"default","image":"75a86ebb-ed04-4f13-a9d5-daa5cd8acec2","flavor":"2_2_20","keypair":"not-set","hostname":"k","usage_purpose":"created by system","supervisor":"created by system","supervisor_phone_number":"created by system","date_request":"2018-05-17 09:25:44","status":"5","date_approval":"default","id_admin":"0"},{"id":"178","identifier_vm":"e03867dac3751d4fb308fe9c1a685050","user_name":"Rehan","id_user":"41","id_vm":"1b5568bf-d00c-4315-84c6-dbf010ab35fc","ip_vm":"10.14.36.182","image":"665ee283-f781-4f39-b145-ceae23bcf8b1","flavor":"1_1_20","keypair":"not-set","hostname":"first","usage_purpose":"created by system","supervisor":"created by system","supervisor_phone_number":"created by system","date_request":"2018-05-07 15:38:14","status":"2","date_approval":"default","id_admin":"0"}]
     */

    private boolean result;
    private String message;
    private List<VmDataBean> vm_data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<VmDataBean> getVm_data() {
        return vm_data;
    }

    public void setVm_data(List<VmDataBean> vm_data) {
        this.vm_data = vm_data;
    }
}
