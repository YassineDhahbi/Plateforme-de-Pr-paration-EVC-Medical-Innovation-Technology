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

import com.app.dev.MODEL.Temoignage;
import com.app.dev.SERVICES.Temoignageservices;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/api")

public class TemoignageControl {
    @Autowired
    private Temoignageservices os;

    @GetMapping(path = "/temoignageall")
    public @ResponseBody Iterable<Temoignage> getAll() {
        return os.findAll();
    }

    @GetMapping(path = "/temoignagehello")
    public String test() {
        return "Temoignage DONE";
    }

    @GetMapping(value = "/temoignagefind{fid}")
    public Optional<Temoignage> findbyid(@PathVariable int fid) {
        Optional<Temoignage> fc = os.findbyid(fid);
        if (fc != null) {
            return fc;
        } else {
            return null;
        }
    }

    @PostMapping(path = { "/temoignagenew" })
    private Temoignage addtemoignage(@RequestBody Temoignage temoignage) {
        if (temoignage == null) {
            return null;
        } else

        {
            return this.os.create(temoignage);

        }

    }

    @PutMapping(path = { "/temoignageupdate" })
    private Temoignage updateoffre(@RequestBody Temoignage temoignage) {
        return os.update(temoignage);
    }

    @DeleteMapping(path = "/temoignagedelete{id}")
    private Temoignage Deletetemoignage(@PathVariable int id) {

        os.Delete(id);
        return null;

    }
}


