package com.example.hm43;

public class Contact {
    private String number;
    private String name;
    private String image;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Contact(String number, String name, String image) {
        this.number = number;
        this.name = name;
        this.image = image;
    }
}
