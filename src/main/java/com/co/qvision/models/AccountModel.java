package com.co.qvision.models;

import java.util.List;

public class AccountModel {
    private String userName;
    private String email;
    private String password;

    public AccountModel(List<String> listDataAccount) {
        this.userName = listDataAccount.get(0);
        this.email = listDataAccount.get(1);
        this.password = listDataAccount.get(2);
    }

    public AccountModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
