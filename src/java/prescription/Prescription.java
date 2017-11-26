/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prescription;

/**
 *
 * @author mly083
 */
public class Prescription {
    // adm == administration
    String drugNumber, drugName;
    double unitsPerDay;
    int admPerDay;
    String admMethod;
    String startDate, endDate;
    
    public Prescription(){
        
    }

    public String getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(String drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getUnitsPerDay() {
        return unitsPerDay;
    }

    public void setUnitsPerDay(double unitsPerDay) {
        this.unitsPerDay = unitsPerDay;
    }

    public int getAdmPerDay() {
        return admPerDay;
    }

    public void setAdmPerDay(int admPerDay) {
        this.admPerDay = admPerDay;
    }

    public String getAdmMethod() {
        return admMethod;
    }

    public void setAdmMethod(String admMethod) {
        this.admMethod = admMethod;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
}
