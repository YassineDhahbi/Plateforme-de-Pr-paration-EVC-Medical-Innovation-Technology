package com.app.dev.SERVICES;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.Contactoffre;
import com.app.dev.Repository.Daocontactoffre;
@Service

public class Contactoffreservices extends Abstarctservices<Contactoffre> {
    private final Daocontactoffre DAO;

    @Autowired
    public Contactoffreservices(Daocontactoffre dao) {
        this.DAO = dao;
    }

    @Override
    public Iterable<Contactoffre> findAll() {
        // TODO Auto-generated method stub
        return this.DAO.findAll();
    }
    @Override
    public Optional<Contactoffre> findbyid(int id) {
        // TODO Auto-generated method stub
        return this.DAO.findById(id);
    }
    @Override
    public void Delete(int id) {
        // TODO Auto-generated method stub
        this.DAO.deleteById(id);
    }
    @Override
    public Contactoffre update(Contactoffre a) {
        // TODO Auto-generated method stub
        return this.DAO.save(a);
    }
    @Override
    public Contactoffre create(Contactoffre a) {
        // TODO Auto-generated method stub
        return this.DAO.save(a);
    }
}
