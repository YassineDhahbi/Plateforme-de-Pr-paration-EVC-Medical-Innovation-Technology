package com.app.dev.CONTROL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dev.MODEL.ActualitesEVC;
import com.app.dev.Repository.DAOActualitesEVC;



@RestController
public class TomcatController {
	@Autowired
    private DAOActualitesEVC countryDAO;
	
    @GetMapping("/hello")
    public Collection<String> sayHello() {
    	List<String> l=new ArrayList<>();
    	l.add("bonjou");
        l.add("ali");
    	//private SessionFactory sessionFactory;
    	//Session session=sessionFactory.getCurrentSession();
    	try {
    		Iterable<ActualitesEVC> all = countryDAO.findAll();
            System.out.print(all.toString());
            all.forEach(p -> l.add(p.getTitre() + "<br>"));
            return l;
           /* return sessionFactory.getCurrentSession()
            .createQuery("FROM USER")
            .getResultList(); */
        }
        catch (Exception e) {
            //throw new RuntimeException(e);
        	
        	l.add("erreur: "+e.getMessage()+";;"+Arrays.toString(e.getStackTrace()));
            
        }
    	
    	
    
    	
    	

        return l;
    }
}