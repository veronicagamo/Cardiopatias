/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Usuario
 */
public class PanelSintomas extends JFrame implements ActionListener{
    private JPanel panelSintomas;
    private JRadioButton[] botonesSintomas;
    private JButton aceptar;
    private JButton salir;
    public  PanelSintomas(){
    panelSintomas = new JPanel(new GridLayout(5, 5));
    String[] nombresSintomas = {
            "Dolor u Opresión Torácica", "Dolor de Cuello", "Dolor de Pecho", "Dolor Brazo Izquierdo", "Dolor de Mandíbula",
             "Náuseas", "Vómitos", "Mareos", "Sudoración fría","Duración Dolor > 20 mins","Duración Dolor < 20 mins",
           "Duración Dolor Aprox. 20 mins", "Dificultad de Respirar", "Aparición por Estrés", "Aparición por Esfuerzo Físico", 
           "Desaparece en reposo", "Efecto a Nitroglicerina Sublingual"
        };
     for(int i=0;i<nombresSintomas.length;i++){
     botonesSintomas[i].add(new JRadioButton(nombresSintomas[i]));
     botonesSintomas[i].setPreferredSize(new Dimension(100, 100));
     panelSintomas.add(botonesSintomas[i]);
     }
    aceptar= new JButton ("Aceptar");
    panelSintomas.add(aceptar,BorderLayout.PAGE_END);
     aceptar.setBackground(Color.green);
     aceptar.addActionListener(this);
     salir= new JButton ("Exit");
      panelSintomas.add(salir,BorderLayout.PAGE_END);
       salir.setBackground(Color.red);
        salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                   
         Object source = e.getSource();
          /* if (source==aceptar){
             if(botonesSintomas[0].isSelected()){  
            sin1=new Sintoma(idPac,idPac,TipoSintoma.DOLOR_TORÁCICO);
             System.out.println(sin1);
             ksession.insert(sin1);
             }
             if(botonesSintomas[1].isSelected()){
             Sintoma sin2=new Sintoma(idPac,idPac,TipoSintoma.DOLOR_CUELLO);
             ksession.insert(sin2);*/
    }
}
