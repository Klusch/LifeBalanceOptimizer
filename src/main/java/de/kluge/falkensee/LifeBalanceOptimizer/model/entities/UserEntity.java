package de.kluge.falkensee.LifeBalanceOptimizer.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {


	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
 
    // standard constructors / setters / getters / toString

    public UserEntity() {
    	
    }
    
	public UserEntity(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	
}
