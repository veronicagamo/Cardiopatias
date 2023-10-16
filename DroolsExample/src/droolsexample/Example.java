/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droolsexample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 *
 * @author alberto.gildelafuent
 */
public class Example {

    public static void main(String[] args) {
       KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        
        KieSession ksession = kc.newKieSession("DIAGNOSIS");
  
        Paciente pat=new Paciente (1,"jorge",30, Sexo.MASCULINO);
        Sintoma sin= new Sintoma (1,1, TipoSintoma.DOLOR_MANDIBULA);
          Sintoma sin2= new Sintoma (2,1, TipoSintoma.DOLOR_TORÁCICO);
        //  Sintoma sin3= new Sintoma (3,1, TipoSintoma.DIFICULTAD_RESPIRAR);
         Diagnostico dia= new Diagnostico(1,1);
        
        ksession.insert(pat);
      ksession.insert(sin);
        ksession.insert(sin2);
       // ksession.insert(sin3);
      
        ksession.insert(dia);
        System.out.println("AFTER");
        ksession.fireAllRules();
         System.out.println(dia.getCardiopatia());
         System.out.println(dia.getScore());
        System.out.println(dia.getCredibilidad());
        ksession.dispose();
    }

    
}
