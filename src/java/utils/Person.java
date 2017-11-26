/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Date;

/**
 *
 * @author mly083
 */
public class Person {
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private Date dataOfBirth;
    private Gender gender;
    private MartialStatus martialStatus;

    public Person() {
    
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Date getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(MartialStatus martialStatus) {
        this.martialStatus = martialStatus;
    }
    
}
