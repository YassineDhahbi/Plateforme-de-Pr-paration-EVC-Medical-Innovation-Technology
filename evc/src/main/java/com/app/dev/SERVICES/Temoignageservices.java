package com.app.dev.SERVICES;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.Temoignage;
import com.app.dev.Repository.DAOtemoignage;
@Service

public class Temoignageservices extends Abstarctservices<Temoignage>{
    private final DAOtemoignage DAO;

    @Autowired
    public Temoignageservices(DAOtemoignage dao) {
        this.DAO = dao;

    }

    @Override
    public Iterable<Temoignage> findAll() {
        // TODO Auto-generated method stub
        return this.DAO.findAll();
    }

    @Override
    public Optional<Temoignage> findbyid(int id) {
        // TODO Auto-generated method stub
        return this.DAO.findById(id);
    }

    @Override

    public Temoignage update(Temoignage act) {
        return this.DAO.save(act);
    }

    @Override
    public void Delete(int id) {
        // TODO Auto-generated method stub
        this.DAO.deleteById(id);
    }

    @Override
    public Temoignage create(Temoignage a) {
        // TODO Auto-generated method stub
        return this.DAO.save(a);
    }

}
