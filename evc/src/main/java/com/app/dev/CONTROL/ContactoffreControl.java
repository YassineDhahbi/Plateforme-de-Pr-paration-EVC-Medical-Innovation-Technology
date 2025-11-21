package com.app.dev.CONTROL;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dev.MODEL.Contactoffre;
import com.app.dev.SERVICES.Contactoffreservices;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ContactoffreControl {
    @Autowired
    private Contactoffreservices cs;

    @GetMapping(path = "/contactoffreall")
    public @ResponseBody Iterable<Contactoffre> getAll() {
        return cs.findAll();
    }

    @GetMapping(path = "/contactoffrehello")
    public String test() {
        return "contactoffre DONE";
    }

    @GetMapping(value = "/contactoffrefind{fid}")
    public Optional<Contactoffre> findbyid(@PathVariable int fid) {
        Optional<Contactoffre> fc = cs.findbyid(fid);
        if (fc != null) {
            return fc;
        } else {
            return null;
        }
    }

    @PostMapping(path = { "/contactoffreadd" })
    private Contactoffre addcontactoffre(@RequestBody Contactoffre medca) {
        if (medca == null) {
            return null;
        } else

        {
            return cs.create(medca);

        }
        // return medca.toString();

    }

    @PutMapping(path = { "/contactoffreupdate" })
    private Contactoffre updatecontactoffre(@RequestBody Contactoffre medca) {
        return cs.update(medca);
    }

    @DeleteMapping(path = "/contactoffredelete{id}")
    private void Deletecontactoffre(@PathVariable int id) {
        cs.Delete(id);

    }
}
