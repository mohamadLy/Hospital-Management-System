/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author mly083
 */
@Named(value = "patientFileFacade")
@SessionScoped
public class PatientFileFacade implements Serializable {

    /**
     * Creates a new instance of PatientFileFacade
     */
    public PatientFileFacade() {
    }
    
}
