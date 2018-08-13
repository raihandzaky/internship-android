package com.example.veradebora.retrofitcoba.response.ApiResponse;

/**
 * Created by Vera Debora on 7/5/2018.
 */

public class LoginResponse {

    /**
     * result : true
     * message : login successfully
     * user_data : {"id":"3","ip_address":"::1","username":"technowizard17@gmail.com","password":"$2y$08$1OkRywk69OeZP1PPgmNhM.nvC1Z20CX4B/s/0VoYQTD3WBNF0AQL6","salt":null,"email":"technowizard17@gmail.com","activation_code":null,"forgotten_password_code":null,"forgotten_password_time":null,"remember_code":null,"created_on":"1489149554","last_login":"1530761427","active":"1","is_admin":"0","name":"Fadhil","user_id_os":"22b5ef0652a24d179a3acde1b1203298","param1":"default","param2":"ba01c561c5a74","user_id":"2","group_id":"2"}
     */

    private boolean result;
    private String message;
    private UserDataBean user_data;

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

    public UserDataBean getUser_data() {
        return user_data;
    }

    public void setUser_data(UserDataBean user_data) {
        this.user_data = user_data;
    }

    public static class UserDataBean {
        /**
         * id : 3
         * ip_address : ::1
         * username : technowizard17@gmail.com
         * password : $2y$08$1OkRywk69OeZP1PPgmNhM.nvC1Z20CX4B/s/0VoYQTD3WBNF0AQL6
         * salt : null
         * email : technowizard17@gmail.com
         * activation_code : null
         * forgotten_password_code : null
         * forgotten_password_time : null
         * remember_code : null
         * created_on : 1489149554
         * last_login : 1530761427
         * active : 1
         * is_admin : 0
         * name : Fadhil
         * user_id_os : 22b5ef0652a24d179a3acde1b1203298
         * param1 : default
         * param2 : ba01c561c5a74
         * user_id : 2
         * group_id : 2
         */

        private String id;
        private String ip_address;
        private String username;
        private String password;
        private Object salt;
        private String email;
        private Object activation_code;
        private Object forgotten_password_code;
        private Object forgotten_password_time;
        private Object remember_code;
        private String created_on;
        private String last_login;
        private String active;
        private String is_admin;
        private String name;
        private String user_id_os;
        private String param1;
        private String param2;
        private String user_id;
        private String group_id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIp_address() {
            return ip_address;
        }

        public void setIp_address(String ip_address) {
            this.ip_address = ip_address;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getSalt() {
            return salt;
        }

        public void setSalt(Object salt) {
            this.salt = salt;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Object getActivation_code() {
            return activation_code;
        }

        public void setActivation_code(Object activation_code) {
            this.activation_code = activation_code;
        }

        public Object getForgotten_password_code() {
            return forgotten_password_code;
        }

        public void setForgotten_password_code(Object forgotten_password_code) {
            this.forgotten_password_code = forgotten_password_code;
        }

        public Object getForgotten_password_time() {
            return forgotten_password_time;
        }

        public void setForgotten_password_time(Object forgotten_password_time) {
            this.forgotten_password_time = forgotten_password_time;
        }

        public Object getRemember_code() {
            return remember_code;
        }

        public void setRemember_code(Object remember_code) {
            this.remember_code = remember_code;
        }

        public String getCreated_on() {
            return created_on;
        }

        public void setCreated_on(String created_on) {
            this.created_on = created_on;
        }

        public String getLast_login() {
            return last_login;
        }

        public void setLast_login(String last_login) {
            this.last_login = last_login;
        }

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }

        public String getIs_admin() {
            return is_admin;
        }

        public void setIs_admin(String is_admin) {
            this.is_admin = is_admin;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUser_id_os() {
            return user_id_os;
        }

        public void setUser_id_os(String user_id_os) {
            this.user_id_os = user_id_os;
        }

        public String getParam1() {
            return param1;
        }

        public void setParam1(String param1) {
            this.param1 = param1;
        }

        public String getParam2() {
            return param2;
        }

        public void setParam2(String param2) {
            this.param2 = param2;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }
    }
}
