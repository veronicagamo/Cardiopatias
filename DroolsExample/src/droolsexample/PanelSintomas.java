/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

import java.awt.BorderLayout;
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
public class PanelSintomas extends JFrame implements ActionListener{
    private JPanel panelSintomas;
     private JFrame frame;
       private  Container contentpane;
    private boolean accionCompletada;
    private ArrayList<JCheckBox> sintomaCaja;
    private JButton aceptar;
    private JButton salir;
    private ArrayList<Sintoma> sintomas;
    
    public  PanelSintomas(){
        frame=new JFrame();
   contentpane = getContentPane();
    panelSintomas = new JPanel(new GridLayout(10, 2));
    String[] nombresSintomas = {
            "Dolor u Opresión Torácica", "Dolor de Cuello", "Dolor de Pecho", "Dolor Brazo Izquierdo", "Dolor de Mandíbula",
             "Náuseas", "Vómitos", "Mareos", "Sudoración fría","Duración Dolor > 20 mins","Duración Dolor < 20 mins",
           "Duración Dolor Aprox. 20 mins", "Dificultad de Respirar", "Aparición por Estrés", "Aparición por Esfuerzo Físico", 
           "Desaparece en reposo", "Efecto a Nitroglicerina Sublingual"
        };

 sintomaCaja = new ArrayList<>();
        for (String nombre : nombresSintomas) {
            JCheckBox checkbox = new JCheckBox(nombre);
            panelSintomas.add(checkbox);
            sintomaCaja.add(checkbox);
        }
        panelSintomas.add(new JLabel(""));
    aceptar= new JButton ("Aceptar");
    panelSintomas.add(aceptar,BorderLayout.PAGE_END);
     aceptar.setBackground(Color.green);
     aceptar.addActionListener(this);
     salir= new JButton ("Exit");
      panelSintomas.add(salir,BorderLayout.PAGE_END);
       salir.setBackground(Color.red);
        salir.addActionListener(this);
        contentpane.add(panelSintomas);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                   
         Object source = e.getSource();
         sintomas=new ArrayList<>();
         if (source == aceptar) {
            for (JCheckBox checkbox : sintomaCaja) {
                if (checkbox.isSelected()) {
                    String nombreSintoma = checkbox.getText();
                    Sintoma sintoma = sintomaSegunCaja(nombreSintoma);
                    if (sintoma != null) {
                        sintomas.add(sintoma);
                    }
                }
            }
            accionCompletada = true;
        } else if (source == salir) {
            System.exit(0);
        }
           
    }
    
   public ArrayList<Sintoma> getSintomas(){
   return this.sintomas;
   }
   
    public boolean isAccionCompletada() {
        return accionCompletada;
    }
    
      private Sintoma sintomaSegunCaja(String nombre) {
          switch (nombre) {
        case "Dolor u Opresión Torácica":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DOLOR_TORÁCICO);
        case "Dolor de Cuello":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DOLOR_CUELLO);
        case "Dolor de Pecho":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DOLOR_PECHO);
        case "Dolor Brazo Izquierdo":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DOLOR_BRAZO_IZQUIERDO);
        case "Dolor de Mandíbula":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DOLOR_MANDIBULA);
        case "Náuseas":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.NÁUSEAS);
        case "Vómitos":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.VÓMITOS);
        case "Mareos":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.MAREOS);
        case "Sudoración fría":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.SUDORACIÓN);
        case "Duración Dolor > 20 mins":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DURACIÓN_MAYOR_20);
        case "Duración Dolor < 20 mins":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DURACIÓN_MENOR_20);
        case "Duración Dolor Aprox. 20 mins":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DURACIÓN_20);
        case "Dificultad de Respirar":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DIFICULTAD_RESPIRAR); 
        case "Aparición por Estrés":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.APARICIÓN_ESTRÉS);
        case "Aparición por Esfuerzo Físico":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.APARICIÓN_ESFUERZO_FÍSICO); 
        case "Desaparece en reposo":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.DESAPARECE_EN_REPOSO);
        case "Efecto a Nitroglicerina Sublingual":
            return new Sintoma(UUID.randomUUID(),TipoSintoma.EFECTO_A_NITOGLICERINA_SUBLINGUAL);
    }
        return null;
    }
}
