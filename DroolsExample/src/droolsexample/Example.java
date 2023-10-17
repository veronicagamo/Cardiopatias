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
         Sintoma sin3= new Sintoma (3,1, TipoSintoma.DIFICULTAD_RESPIRAR);
        Sintoma sin4= new Sintoma (4,1, TipoSintoma.DURACIÓN_MENOR_20);
        Sintoma sin5= new Sintoma (5,1, TipoSintoma.EFECTO_A_NITOGLICERINA_SUBLINGUAL);
        Sintoma sin6= new Sintoma (6,1, TipoSintoma.DESAPARECE_EN_REPOSO);
          Sintoma sin7= new Sintoma (7,1, TipoSintoma.APARICIÓN_ESFUERZO_FÍSICO);
         Pruebas p7= new Pruebas (7,1,EnumPruebas.OCLUSIÓN_PARCIAL);

         Diagnostico dia= new Diagnostico(1,1);
        
        ksession.insert(pat);
     ksession.insert(sin);
        ksession.insert(sin2);
       ksession.insert(sin3);
       ksession.insert(sin4);
       ksession.insert(sin5);
      ksession.insert(sin6);
       ksession.insert(sin7);
   
       ksession.insert(p7);
    
        ksession.insert(dia);
        System.out.println("AFTER");
        ksession.fireAllRules();
         System.out.println(dia.getCardiopatia());
        System.out.println(dia.getTipo());
        System.out.println(dia.getGravedad());
        
        ksession.dispose();
    }

    
}
