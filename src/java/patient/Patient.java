/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import division.Room;
import java.util.List;
import prescription.Prescription;
import staff.Doctor;
import utils.Address;
import utils.Person;

/**
 *
 * @author mly083
 */
public class Patient extends Person {
    private String insuranceNumber;
    private String extDocID;
    private String localDocID;
    private List<Prescription> prescriptions;
    private NextOfKin nextOfKin;
    private Address address;
    private Room room;
    private Doctor doctor;
    
    public Patient(){
        // As person need to have address as soon as it is created
        address = new Address();
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
