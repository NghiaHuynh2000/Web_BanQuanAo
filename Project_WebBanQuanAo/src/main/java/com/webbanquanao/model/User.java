package com.webbanquanao.model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String avatar;
    private String email;
    private String userName;
    private String password;
    private String address;
    private int permission;
    private int roleId;

    public User(){
        super();
    }

    public User(String email, String userName, String password) {
        super();
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public User(int id, String avatar, String email, String userName, String password, String address, int permission) {
        super();
        this.id = id;
        this.avatar = avatar;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.permission = permission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
