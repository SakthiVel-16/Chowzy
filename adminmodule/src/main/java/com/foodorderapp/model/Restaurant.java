package com.foodorderapp.model;

public class Restaurant {
    private String id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;

    // No-argument constructor
    public Restaurant() {}

    // Constructor with arguments
    public Restaurant(String id, String name, String email, String password, String address, String phone) {
        this.id= id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Restaurant [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone + "]";
    }
}

