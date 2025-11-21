package com.app.dev.Security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="user")
public class User {
@Id
private int id ;
}
