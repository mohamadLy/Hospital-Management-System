/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import utils.Person;
import utils.RelationshipType;


/**
 *
 * @author mly083
 */
public class NextOfKin extends Person {
    RelationshipType relationship;
    
    public NextOfKin(){
        
    }

    public RelationshipType getRelationship() {
        return relationship;
    }

    public void setRelationship(RelationshipType relationship) {
        this.relationship = relationship;
    }
    
}
