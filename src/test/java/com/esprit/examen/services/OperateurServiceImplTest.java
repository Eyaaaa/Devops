package com.esprit.examen.services;

import static org.junit.Assert.*;
import java.util.List;

import com.esprit.examen.entities.SecteurActivite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.esprit.examen.entities.Operateur;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperateurServiceImplTest {
    @Autowired
    IOperateurService operateurService;

    @Test
    public void testAddOperateur() {
  
        Operateur s = new Operateur("test","test","test");
        Operateur savedOperateur= operateurService.addOperateur(s);

       
        assertNotNull(savedOperateur.getNom());
         operateurService.deleteOperateur(savedOperateur.getIdOperateur());

    }

    

}
