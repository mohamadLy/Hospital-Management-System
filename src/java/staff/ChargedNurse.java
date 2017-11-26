/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import division.Division;
import java.util.List;

/**
 *
 * @author mly083
 */
public class ChargedNurse extends StaffMember{
    private String telephoneExtension;
    private String beeperExt;
    private List<Division> division;
    
    public ChargedNurse() {}

    public String getTelephoneExtension() {
        return telephoneExtension;
    }

    public void setTelephoneExtension(String telephoneExtension) {
        this.telephoneExtension = telephoneExtension;
    }

    public String getBeeperExt() {
        return beeperExt;
    }

    public void setBeeperExt(String beeperExt) {
        this.beeperExt = beeperExt;
    }
    
    
}
