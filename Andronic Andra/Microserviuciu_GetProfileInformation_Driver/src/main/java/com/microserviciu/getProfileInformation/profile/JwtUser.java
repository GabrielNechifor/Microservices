package com.microserviciu.getProfileInformation.profile;

public class JwtUser {
    private String userName;
    private String role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

 

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }


    public String getRole() {
        return role;
    }
}
