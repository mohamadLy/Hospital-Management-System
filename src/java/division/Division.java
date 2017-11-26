/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

import java.util.List;
import staff.ChargedNurse;
import utils.DivisionStatus;

/**
 *
 * @author mly083
 */
public class Division {
    private int divisionID;
    private String name;
    private String location;
    private int numberOfBed;
    private String telephoneExtension;
    private DivisionStatus status;
    private List<Division> division;
    private ChargedNurse chardedNurse;

    public Division() {}
    
    public int getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public String getTelephoneExtension() {
        return telephoneExtension;
    }

    public void setTelephoneExtension(String telephoneExtension) {
        this.telephoneExtension = telephoneExtension;
    }

    public DivisionStatus getStatus() {
        return status;
    }

    public void setStatus(DivisionStatus status) {
        this.status = status;
    }
    
    
}
