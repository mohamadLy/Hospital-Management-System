/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author mly083
 */
@Named(value = "staffMemberManagerFacade")
@SessionScoped
public class StaffMemberManagerFacade implements Serializable {

    /**
     * Creates a new instance of StaffMemberManagerFacade
     */
    public StaffMemberManagerFacade() {
    }
    
}