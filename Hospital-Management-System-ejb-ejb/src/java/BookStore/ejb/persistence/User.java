/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookStore.ejb.persistence;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ssome
 */
@Entity
@Table(name="User0300039777")
public class User implements Serializable {
     private static final long serialVersionUID = 1L;
        @Id
    private String username;
    private String password;
    private String email;
//    private String longDescription;
//    private double cost;
//    private String category;

    public User() {

    }

    /** Creates a new instance of Item
     * @param itemID
     * @param shortDescription
     * @param longDescription
     * @param cost
     * @param cat */
    public User(String username, String password,String email) {
        this.username=username;
        this.password=password;
        this.email=email;
//        this.longDescription=longDescription;
//        this.cost=cost;
//        this.category=cat;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
 

//     @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (this.itemID != null ? this.itemID.hashCode() : 0);
//        return hash;
//    }

//     @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof User)) {
//            return false;
//        }
//        User other = (User)object;
//        if (this.itemID != other.itemID && (this.itemID == null || !this.itemID.equals(other.itemID))) return false;
//        return true;
//    }

     @Override
    public String toString() {
        return "Library.persistence.Item[id=" + username + "]";
    }
}
