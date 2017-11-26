/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import utils.Person;

/**
 *
 * @author mly083
 */
public class StaffMember extends Person{
    private int stuffID;
    private String password;
    private String email;

    public StaffMember() {}
    
    public int getStuffID() {
        return stuffID;
    }

    public void setStuffID(int stuffID) {
        this.stuffID = stuffID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
