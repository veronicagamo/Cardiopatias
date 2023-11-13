/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droolsexample;


import java.util.ArrayList;
import java.util.UUID;
import javax.swing.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

 
 public class Example {
  
    public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer  kc = ks.getKieClasspathContainer();
       KieSession ksession = kc.newKieSession("DIAGNOSIS");
        PanelFormulario panelFormulario= new PanelFormulario();
         panelFormulario.setTitle("Diagnóstico de Cardiopatías Isquémicas");
        panelFormulario.setSize(500, 400);
        panelFormulario.setVisible(true);
        panelFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
while (!panelFormulario.isAccionCompletada()) {
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
Paciente paciente =panelFormulario.getPaciente();
            ksession.insert(paciente);
            Diagnostico diagnostico = new Diagnostico(UUID.randomUUID(),paciente.getId());
            ksession.insert(diagnostico);
    ArrayList <FactoresRiesgo> factores=panelFormulario.getFactores();
       for (FactoresRiesgo factor : factores) {
      ksession.insert(factor);
}
      PanelSintomas panelSintomas= new PanelSintomas();
       panelSintomas.setTitle("Seleccionar Síntomas");
       panelSintomas.setSize(800, 800);
       panelSintomas.setVisible(true);
 
       while (!panelSintomas.isAccionCompletada()) {
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
       ArrayList <Sintoma> sintomas=panelSintomas.getSintomas();
       for (Sintoma sintoma : sintomas) {
      sintoma.setIdPaciente(paciente.getId());
      ksession.insert(sintoma);
}
      PanelPruebas panelPruebass= new PanelPruebas();
       panelPruebass.setTitle("Seleccionar Síntomas Procedentes de Pruebas Complementarias");
       panelPruebass.setSize(800, 800);
       panelPruebass.setVisible(true);
       
        while (!panelPruebass.isAccionCompletada()) {
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
  ArrayList <Pruebas> pruebas=panelPruebass.getPruebas();
   for (Pruebas prueba : pruebas) {
      prueba.setIdPaciente(paciente.getId());
      ksession.insert(prueba);
}
     ksession.fireAllRules();
        ksession.dispose();
        PanelDiagnostico panelDiag= new PanelDiagnostico();
        panelDiag.setTitle("Diagnóstico Final");
       panelDiag.setSize(800, 800);
       panelDiag.setVisible(true);
       panelDiag.setDiagnostico(diagnostico);
    }
      
   }

    
