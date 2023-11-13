/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Usuario
 */
public class PanelPruebas extends JFrame implements ActionListener {

    private JFrame frame;
       private  Container contentpane;
     private boolean accionCompletada;
    private JPanel panel;
     private ArrayList<Pruebas> pruebas;
     private ArrayList<JCheckBox> pruebasCaja;
     private JButton aceptar;
    private JButton salir;
     
     public  PanelPruebas(){
    frame=new JFrame();
   contentpane = getContentPane();
    panel= new JPanel(new GridLayout(7, 2));
    
String[] pruebas = {
    "Necrosis", 
    "Oclusión Completa", 
    "Oclusión Parcial", 
    "Congestión Pulmonar", 
    "Cardiomegalia", 
    "Elevada Troponina", 
    "Elevada Mioglobina", 
    "Elevada CK-MB", 
    "Infradesnivel Segmento ST", 
    "Supradesnivel Segmento ST", 
    "Inversión Onda T"
};
     pruebasCaja = new ArrayList<>();
        for (String prueba : pruebas) {
            JCheckBox boton = new JCheckBox(prueba);
            pruebasCaja.add(boton);
            panel.add(boton);
        }
         panel.add(new JLabel(""));
       salir= new JButton ("Exit");
       salir.setBackground(Color.red);
        salir.addActionListener(this);
       panel.add(salir);
       aceptar= new JButton ("Obtener Diagnóstico");
       aceptar.setBackground(Color.green);
        aceptar.addActionListener(this);
       panel.add(aceptar);
         contentpane.add(panel);
         
    } 
             
    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
         pruebas=new ArrayList<>();
         if (source == aceptar) {
            for (JCheckBox checkbox : pruebasCaja) {
                if (checkbox.isSelected()) {
                    String nombrePrueba = checkbox.getText();
                    Pruebas prueba = pruebaSegunCaja(nombrePrueba);
                    if (prueba != null) {
                        pruebas.add(prueba);
                    }
                }
            }
            accionCompletada = true;
        } else if (source == salir) {
            System.exit(0);
        }
    }
     public boolean isAccionCompletada() {
        return accionCompletada;
    }
    
      private Pruebas pruebaSegunCaja(String nombre) {
        switch(nombre){
            case "Necrosis": return new Pruebas (UUID.randomUUID(),EnumPruebas.NECROSIS);
            case "Oclusión Completa": return new Pruebas (UUID.randomUUID(),EnumPruebas.OCLUSIÓN_COMPLETA);
            case "Oclusión Parcial": return new Pruebas (UUID.randomUUID(),EnumPruebas.OCLUSIÓN_PARCIAL);
            case "Congestión Pulmonar": return new Pruebas (UUID.randomUUID(),EnumPruebas.CONGESTIÓN_PULMONAR);
            case "Cardiomegalia": return new Pruebas (UUID.randomUUID(),EnumPruebas.CARDIOMEGALIA);
            case "Elevada Troponina": return new Pruebas (UUID.randomUUID(),EnumPruebas.ELEVADA_TROPONINA);
            case "Elevada Mioglobina": return new Pruebas (UUID.randomUUID(),EnumPruebas.ELEVADA_MIOGLOBINA);
            case "Elevada CK-MB": return new Pruebas (UUID.randomUUID(),EnumPruebas.ELEVADA_CK_MB);
            case "Infradesnivel Segmento ST": return new Pruebas (UUID.randomUUID(),EnumPruebas.INFRADESNIVEL_ST);
            case "Supradesnivel Segmento ST": return new Pruebas (UUID.randomUUID(),EnumPruebas.SUPRADESNIVEL_ST);
            case "Inversión Onda T": return new Pruebas (UUID.randomUUID(),EnumPruebas.INVERSIÓN_T);   
        }  
       return null;
    }
      
      public ArrayList <Pruebas> getPruebas(){
      return this.pruebas;
      }
}
