/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore.ejb.beans;

import BookStore.ejb.persistence.User;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 *
 * @author escroc
 */
@Stateless
public class UserManager extends AbstractFacade<User> implements UserManagerLocal {

      @PersistenceContext(unitName = "BookStore-ejbPU")
    private EntityManager em;

    public UserManager() {
        super(User.class);
    }


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }


    
      @Override
    public boolean addItem(String itemID, String shortDesc,String email) {
        User item= new User(itemID, shortDesc , email);
        try {
            create(item);
        } catch (Exception e) {
            return false ;
        }
        return true;
    }

    @Override
    public List<User> findByCategory(String category) {
        try {
            Query query = em.createQuery(
                "SELECT u FROM Item u" +
                " WHERE u.category = :ItemCategory");
            query.setParameter("ItemCategory",category);

            List resultList = query.getResultList();
            return resultList;
        } catch (Exception e) {
        }
        return null;
    }   
}
