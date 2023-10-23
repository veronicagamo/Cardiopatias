/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droolsexample;


import javax.swing.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

 
 public class Example {
  
    public static void main(String[] args) {
        PanelFormulario panelFormulario= new PanelFormulario();
         panelFormulario.setTitle("Diagnóstico de Cardiopatías Isquémicas");
        panelFormulario.setSize(500, 400);
        panelFormulario.setVisible(true);
        panelFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Paciente paciente =panelFormulario.getPaciente();
         System.out.println(paciente);
       /*PanelSintomas panelSintomas= new PanelSintomas();
       panelSintomas.setTitle("Seleccionar Síntomas");
                    
                    panelSintomas.setSize(800, 800);
                    panelSintomas.setVisible(true);*/
      /* KieServices ks = KieServices.Factory.get();
        KieContainer  kc = ks.getKieClasspathContainer();
       KieSession ksession = kc.newKieSession("DIAGNOSIS");
       Paciente paciente =panelFormulario.getPaciente();
    ksession.insert(paciente);
     ksession.fireAllRules();
        ksession.dispose();*/
    }
      
   }

    
