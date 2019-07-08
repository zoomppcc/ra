package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User{
    @Id
    @GeneratedValue
    private String U_ID;
    private String U_NAME;
    private String U_GENDER;
    private String U_ADDRESS;
    public User(){

    }
    public void setU_ID(String U_ID) {
        this.U_ID = U_ID;
    }

    public String getId() {
        return U_ID;
    }

    public void setU_NAME(String U_NAME) {
        this.U_NAME = U_NAME;
    }

    public String getName() {
        return U_NAME;
    }

    public void setU_GENDER(String U_GENDER) {
        this.U_GENDER = U_GENDER;
    }

    public String getU_GENDER() {
        return U_GENDER;
    }
    public void setU_ADDRESS(String U_ADDRESS){
        this.U_ADDRESS = U_ADDRESS;
    }

    public String getU_ADDRESS() {
        return U_ADDRESS;
    }
}
