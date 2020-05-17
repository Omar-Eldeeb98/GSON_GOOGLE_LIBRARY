package com.example.gsonexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {


    private String firstName;
    private int age;
    private String mail;
    private String password;


    //  @SerializedName( "address" )
    //  private Address mAddress;
    // @SerializedName( "family" )
   // private List<FamilyMember> mFamily;


    public Employee(String firstName, int age, String mail, String password) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }
}
