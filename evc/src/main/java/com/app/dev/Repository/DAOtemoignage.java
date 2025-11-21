package com.app.dev.Repository;
import com.app.dev.MODEL.Offre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dev.MODEL.Temoignage;
public interface DAOtemoignage extends CrudRepository<Temoignage, Integer>  {
}
