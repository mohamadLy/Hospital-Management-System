/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package staff;

//import beans.CatalogItemData;
import BookStore.ejb.beans.UserManagerLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import persistence.CatalogItem;
//import persistence.DBHelper;
//import persistence.User;

/**
 *
 * @author ssome
 */
@Named(value = "registerStaff")
@RequestScoped
public class RegisterStaff implements Serializable {

    @EJB
    private UserManagerLocal userManager;


    @Resource
    private javax.transaction.UserTransaction utx;
    
    
    @Inject
   private UserData userData;

    
    
    
    
    
    /**
     * Creates a new instance of LookupControl
     */
    public RegisterStaff() {
    }
    
    
//    public void lookup() {
//       List<CatalogItem> results = new ArrayList();
//       if (!"".equals(userData.getID())) 
////       {
//            // lookup by id
//            results = getUserById(em,userData);
////       } else if (!"".equals(userData.getName())) {
////            // lookup by name
////            results = getUsersByName(em,userData);
////       } else if (!"".equals(userData.getBirthdate())) {
////            // lookup by birthdate
////            results = getUsersByBirthDate(em,userData);
////       }
////       userData.setLookupResults(results);
//  
    public void add() {
                    userManager.addItem(userData.getUsername(), userData.getPassword(), userData.getEmail());

//        if (DBHelper.addCatalogItem(em,utx,userData)) {
//            userData.setAddstatus("The item Was Successfuly Added");
//        } else {
//            userData.setAddstatus("Addition of the item Failed");
//        }
    }
        public void addCatalogItem() {
//        if (DBHelper.addCatalogItem(em,utx,userData)) {
//            userData.setAddstatus("The item Was Successfuly Added");
//        } else {
//            userData.setAddstatus("Addition of the item Failed");
//        }
    }
    
        /**
     * Find a user by id and check if any that the other fields are valid
     */
//    private List<CatalogItem> getUserById(EntityManager em,CatalogItemData userData) {
//        ArrayList<CatalogItem> result = new ArrayList<>();
//        CatalogItem user = DBHelper.findUser(em,userData.getID());
////        if (user != null && user.matches(userData)) {
//        if (user != null ) {
//            result.add(user);  
//        }
//        return result;
//    }
//
//    private List<User> getUsersByName(EntityManager em,UserData userData) {
//       List<User> allresults = DBHelper.findUsersByName(em,userData.getName());
//       if (allresults == null) return null;
//       return checkResults(allresults,userData);          
//    }
//
//    private List getUsersByBirthDate(EntityManager em,UserData userData) {
//       List<User> allresults = DBHelper.findUsersByBirthDate(em,userData.getBirthdate());
//       if (allresults == null) return null;
//       return checkResults(allresults,userData);       
//    }
    
//    private List<User> checkResults(List<User> allresults,CatalogItemData userData) {
//        ArrayList<User> results = new ArrayList<>();
//        for (User user: allresults) {
//            if (user.matches(userData)) results.add(user);
//        }
//        return results;
//    }
}
