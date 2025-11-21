package com.app.dev.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dev.MODEL.Contactoffre;
@Repository
public interface Daocontactoffre  extends CrudRepository<Contactoffre, Integer>{
}
