package com.example.veradebora.retrofitcoba.response.ApiResponse;

/**
 * Created by Vera Debora on 7/23/2018.
 */

public class VoucherResponse {

    /**
     * result : true
     * message : use voucher succesfully
     * v_data : {"voucher":{"id":"42","id_user":"32","code":"92f03aa18415000","amount":"15000","status":"1","created_at":"2018-07-13 19:57:15","updated_at":"2018-07-23 14:57:22"},"user_saldo":{"id":"25","id_user":"32","saldo":"15000","update_at":"2018-07-23 14:57:23","email_check":"0"}}
     */

    private boolean result;
    private String message;
    private VDataBean v_data;

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

    public VDataBean getV_data() {
        return v_data;
    }

    public void setV_data(VDataBean v_data) {
        this.v_data = v_data;
    }

    public static class VDataBean {
        /**
         * voucher : {"id":"42","id_user":"32","code":"92f03aa18415000","amount":"15000","status":"1","created_at":"2018-07-13 19:57:15","updated_at":"2018-07-23 14:57:22"}
         * user_saldo : {"id":"25","id_user":"32","saldo":"15000","update_at":"2018-07-23 14:57:23","email_check":"0"}
         */

        private VoucherBean voucher;
        private UserSaldoBean user_saldo;

        public VoucherBean getVoucher() {
            return voucher;
        }

        public void setVoucher(VoucherBean voucher) {
            this.voucher = voucher;
        }

        public UserSaldoBean getUser_saldo() {
            return user_saldo;
        }

        public void setUser_saldo(UserSaldoBean user_saldo) {
            this.user_saldo = user_saldo;
        }

        public static class VoucherBean {
            /**
             * id : 42
             * id_user : 32
             * code : 92f03aa18415000
             * amount : 15000
             * status : 1
             * created_at : 2018-07-13 19:57:15
             * updated_at : 2018-07-23 14:57:22
             */

            private String id;
            private String id_user;
            private String code;
            private int amount;
            private String status;
            private String created_at;
            private String updated_at;

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

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }
        }

        public static class UserSaldoBean {
            /**
             * id : 25
             * id_user : 32
             * saldo : 15000
             * update_at : 2018-07-23 14:57:23
             * email_check : 0
             */

            private String id;
            private String id_user;
            private int saldo;
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

            public int getSaldo() {
                return saldo;
            }

            public void setSaldo(int saldo) {
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
}
