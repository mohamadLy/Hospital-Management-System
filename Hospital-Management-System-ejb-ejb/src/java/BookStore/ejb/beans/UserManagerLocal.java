/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore.ejb.beans;

import BookStore.ejb.persistence.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author escroc
 */
@Local
public interface UserManagerLocal {

void create(User user);

    void edit(User user);

    void remove(User user);

    User  find(Object id);

    List<User > findAll();

    List<User > findRange(int[] range);

    int count();
    
    public boolean addItem(String pseudo, String password, String email);
    
    public List<User > findByCategory(String category);

//    public double getOrderTotal();
}
