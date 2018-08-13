package com.example.veradebora.retrofitcoba.response.ApiResponse;

/**
 * Created by Vera Debora on 7/13/2018.
 */

public class TopUpRequest {

    /**
     * result : true
     * message : top up succesfully
     * bil_data : {"id":"95","date":"2018-07-16 13:00:20","date_expire":"2018-07-17 13:00:20","amount":"56408","status":"0","id_user":"2147483647","name_bank_account":"vera"}
     */

    private boolean result;
    private String message;
    private BilDataBean bil_data;

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

    public BilDataBean getBil_data() {
        return bil_data;
    }

    public void setBil_data(BilDataBean bil_data) {
        this.bil_data = bil_data;
    }

    public static class BilDataBean {
        /**
         * id : 95
         * date : 2018-07-16 13:00:20
         * date_expire : 2018-07-17 13:00:20
         * amount : 56408
         * status : 0
         * id_user : 2147483647
         * name_bank_account : vera
         */

        private String id;
        private String date;
        private String date_expire;
        private String amount;
        private String status;
        private String id_user;
        private String name_bank_account;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDate_expire() {
            return date_expire;
        }

        public void setDate_expire(String date_expire) {
            this.date_expire = date_expire;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getId_user() {
            return id_user;
        }

        public void setId_user(String id_user) {
            this.id_user = id_user;
        }

        public String getName_bank_account() {
            return name_bank_account;
        }

        public void setName_bank_account(String name_bank_account) {
            this.name_bank_account = name_bank_account;
        }
    }
}
