package ru.sapteh.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private String fistName;
    private String lastName;
    private String street;
    private int postalCode;
    private String city;
    private String birthday;

    public Person(){}

    public Person(String fistName,String lastName){
        this.fistName = fistName;
        this.lastName = lastName;

        this.street = "Кукушкино";
        this.postalCode = 1234;
        this.city = "Простоквашино";
        this.birthday = "27.15.2000";
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
