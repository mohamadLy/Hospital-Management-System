/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author mly083
 */
@Named(value = "divisionFacade")
@SessionScoped
public class DivisionFacade implements Serializable {

    /**
     * Creates a new instance of DivisionFacade
     */
    public DivisionFacade() {
    }
    
}
