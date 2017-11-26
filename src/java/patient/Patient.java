/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import utils.Person;

/**
 *
 * @author mly083
 */
public class Patient extends Person {
    String insuranceNumber;
    String extDocID;
    String localDocID;
    
    public Patient(){
        
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getExtDocID() {
        return extDocID;
    }

    public void setExtDocID(String extDocID) {
        this.extDocID = extDocID;
    }

    public String getLocalDocID() {
        return localDocID;
    }

    public void setLocalDocID(String localDocID) {
        this.localDocID = localDocID;
    }
    
}
