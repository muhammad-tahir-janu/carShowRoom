package com.tahir70108.carshowroom;

public class Car {
    String logo;
    String owner;
    String model;
    String tel;

    public Car(String logo, String owner, String model, String tel) {
        this.logo = logo;
        this.owner = owner;
        this.model = model;
        this.tel = tel;
    }

    public Car() {
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
