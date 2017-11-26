/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package staff;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ssome
 */
@Named(value = "userData")
@RequestScoped
public class UserData {
    
    
    private String username;
    private String password;
    private String email;
    private String addstatus;
    /**
     * Creates a new instance of UserData
     */
    public UserData() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

  
    
    public String getAddstatus() {
        return addstatus;
    }

    public void setAddstatus(String addstatus) {
        this.addstatus = addstatus;
    }

//    public void setLookupResults(List<User> results) {
//        this.lookupResults = results;
//    }
//    
//    public List<User> getLookupResults() {
//        return lookupResults;
//    }
    // show results if any
//    public boolean getShowResults() {
//        return (lookupResults != null) && !lookupResults.isEmpty();
//    }
//    // show message if no result
//    public boolean getShowMessage() {
//        return (lookupResults != null) && lookupResults.isEmpty();
//    }
}
