package com.example.veradebora.retrofitcoba.response.ApiResponse;

import java.util.List;

/**
 * Created by Vera Debora on 8/8/2018.
 */

public class BillingHistoryResponse {

    /**
     * result : true
     * message : transaction data found
     * trans_data : [{"hostname":"tidak jadi membajak Tuhan","date_request":"2018-07-16 09:57:17","price":"120","id":"109","id_user":"41","id_vm":"b315ba4c-6abd-4431-b859-7fc5a4a4f1e3","id_flavor":"2_2_20","created_at":"2018-07-19 13:40:15","updated_at":"2018-08-08 13:36:02","amount":"57240","status":"1"},{"hostname":null,"date_request":null,"price":"120","id":"107","id_user":"41","id_vm":"435cfd8e-4e35-48e4-96fa-f460512a3cbb","id_flavor":"2_2_20","created_at":"2018-07-19 13:39:37","updated_at":"2018-08-08 13:36:02","amount":"57240","status":"1"},{"hostname":"Manusia Pembajak Tuhan","date_request":"2018-07-11 11:40:41","price":"160","id":"98","id_user":"41","id_vm":"2bb80d1a-ff09-4a28-999e-f038eb77840e","id_flavor":"2_2_80","created_at":"2018-07-11 11:45:11","updated_at":"2018-08-08 13:30:02","amount":"108800","status":"1"},{"hostname":"first","date_request":"2018-05-07 15:38:14","price":"50","id":"79","id_user":"41","id_vm":"1b5568bf-d00c-4315-84c6-dbf010ab35fc","id_flavor":"1_1_20","created_at":"2018-05-07 15:43:23","updated_at":"2018-08-08 13:30:01","amount":"84050","status":"1"},{"hostname":null,"date_request":null,"price":"120","id":"108","id_user":"41","id_vm":"0acd5d99-d9b0-468a-9645-73ad177b2e95","id_flavor":"2_2_20","created_at":"2018-07-19 13:40:00","updated_at":"2018-08-08 13:14:01","amount":"57240","status":"1"}]
     */

    private boolean result;
    private String message;
    private List<TransDataBean> trans_data;

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

    public List<TransDataBean> getTrans_data() {
        return trans_data;
    }

    public void setTrans_data(List<TransDataBean> trans_data) {
        this.trans_data = trans_data;
    }

}

