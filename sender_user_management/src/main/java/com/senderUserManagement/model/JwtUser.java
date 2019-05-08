package com.senderUserManagement.model;



public class JwtUser {
    private static String userName;
    private static String role;

    public void setUserName(String username) {
        userName = username;
    }
    public void setRole(String userRole) {
       role = userRole;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getRole() {
        return role;
    }
}
