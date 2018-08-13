package com.example.veradebora.retrofitcoba.response.ApiResponse;

/**
 * Created by Vera Debora on 7/9/2018.
 */

public class UserSaldo {

    /**
     * result : true
     * message : saldo data found
     * bil_data : {"id":"4","id_user":"2","saldo":"101359","update_at":"2018-07-09 16:35:01","email_check":"0"}
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
         * id : 4
         * id_user : 2
         * saldo : 101359
         * update_at : 2018-07-09 16:35:01
         * email_check : 0
         */

        private String id;
        private String id_user;
        private String saldo;
        private String update_at;
        private String email_check;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getId_user() {
            return id_user;
        }

        public void setId_user(String id_user) {
            this.id_user = id_user;
        }

        public String getSaldo() {
            return saldo;
        }

        public void setSaldo(String saldo) {
            this.saldo = saldo;
        }

        public String getUpdate_at() {
            return update_at;
        }

        public void setUpdate_at(String update_at) {
            this.update_at = update_at;
        }

        public String getEmail_check() {
            return email_check;
        }

        public void setEmail_check(String email_check) {
            this.email_check = email_check;
        }
    }
}
