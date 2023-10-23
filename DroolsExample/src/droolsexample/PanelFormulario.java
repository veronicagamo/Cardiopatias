/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelFormulario extends JFrame implements ActionListener {
    private JFrame frame;
       private  Container contentpane;
    private JPanel panelFormulario;
     private JPanel panelAtributos;
     private JTextField texto1 ;
      private JTextField texto2;
       private JTextField texto3;
      private JButton aceptar;
      private JButton salir;
      private JRadioButton femBoton;
       private JRadioButton mascBoton;
      private JRadioButton radio1;
      private JRadioButton radio2;
      private JRadioButton radio3;
      private JRadioButton radio4;
      private JRadioButton radio5;
      private JRadioButton radio6;
      private Paciente pac;
      private ArrayList <FactoresRiesgo> factores;
      
public  PanelFormulario(){
    frame=new JFrame();
   contentpane = getContentPane();
        panelFormulario= new JPanel(new GridBagLayout());
         panelAtributos = new JPanel(new GridLayout(10,2));
         JLabel tituloPanelFormulario= new JLabel("DATOS PERSONALES");
         tituloPanelFormulario.setFont(new Font("Serif", Font.BOLD, 30));
       tituloPanelFormulario.setHorizontalAlignment(SwingConstants.CENTER);
        panelAtributos.add(tituloPanelFormulario);
        panelAtributos.add(new JLabel(""));
        JLabel labelId = new JLabel(" DNI SIN LETRA:");
        labelId.setFont(new Font("Arial", Font.BOLD, 16));
         panelAtributos.add(labelId);
       texto3 = new JTextField(10);
        panelAtributos.add(texto3);
        JLabel labelNombre = new JLabel(" NOMBRE Y APELLIDOS:");
        labelNombre.setFont(new Font("Arial", Font.BOLD, 16));
         panelAtributos.add(labelNombre);
       texto1 = new JTextField(50);
        panelAtributos.add(texto1);
        JLabel labelEdad = new JLabel(" EDAD:");
        labelEdad.setFont(new Font("Arial", Font.BOLD, 16));
        panelAtributos.add(labelEdad);
        texto2 = new JTextField(3);
        panelAtributos.add(texto2);
        JLabel labelSexo = new JLabel(" SEXO:");
        labelSexo.setFont(new Font("Arial", Font.BOLD, 16));
        panelAtributos.add(labelSexo);
        JPanel panelSexo = new JPanel(new GridLayout(1,2));
        femBoton=new JRadioButton("Femenino");
       panelSexo.add(femBoton);
       mascBoton=new JRadioButton("Masculino");
        panelSexo.add(mascBoton);
        panelAtributos.add(panelSexo);
        JLabel labelFactores = new JLabel(" FACTORES DE RIESGO:");
        labelFactores.setFont(new Font("Arial", Font.BOLD, 16));
        panelAtributos.add(labelFactores);
        panelAtributos.add(new JLabel(""));
        JPanel panelFactoresRiesgo = new JPanel(new GridLayout(1,6));
        radio1=new JRadioButton("Antecendetes");
        radio2=new JRadioButton("Tabaquismo");
        radio3=new JRadioButton("Diabetes");
        radio4=new JRadioButton("Colesterol Alto");
        radio5=new JRadioButton("Obesidad");
        radio6=new JRadioButton("Hipertensión");
       panelFactoresRiesgo.add(radio1);
       panelFactoresRiesgo.add(radio2);
       panelFactoresRiesgo.add(radio3);
       panelFactoresRiesgo.add(radio4);
       panelFactoresRiesgo.add(radio5);
       panelFactoresRiesgo.add(radio6);
       panelAtributos.add(panelFactoresRiesgo);
       panelAtributos.add(new JLabel(""));
       salir= new JButton ("Exit");
       salir.setBackground(Color.red);
        salir.addActionListener(this);
       panelAtributos.add(salir);
       aceptar= new JButton ("Aceptar");
       aceptar.setBackground(Color.green);
        aceptar.addActionListener(this);
       panelAtributos.add(aceptar);
         panelFormulario.add(panelAtributos);
         contentpane.add(panelFormulario);
         
    } 
   
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==aceptar){
         int idPac= Integer.parseInt(texto3.getText());
      String nombrePac=texto1.getText();
      int edadPac=Integer.parseInt(texto2.getText());
       Sexo sexoPac;
      if (mascBoton.isSelected()) {
                   sexoPac=Sexo.MASCULINO;
                }
      else sexoPac=Sexo.FEMENINO;
       pac=new Paciente(idPac,nombrePac,edadPac,sexoPac);
       factores=new ArrayList <>();
        if (radio1.isSelected()){
           factores.add(new FactoresRiesgo(idPac,idPac,EnumFRiesgo.HISTORIAL_FAMILIAR));}
          if (radio2.isSelected()){
           factores.add(new FactoresRiesgo(idPac,idPac,EnumFRiesgo.TABAQUISMO));
         } 
                  if (radio3.isSelected()){
           factores.add( new FactoresRiesgo(idPac,idPac,EnumFRiesgo.DIABETES));} 
                  if (radio4.isSelected()){
          factores.add(new FactoresRiesgo(idPac,idPac,EnumFRiesgo.COLESTEROL_ELEVADO));} 
                   if (radio5.isSelected()){
           factores.add(new FactoresRiesgo(idPac,idPac,EnumFRiesgo.OBESIDAD));} 
                   if  (radio6.isSelected()){
                      factores.add(new FactoresRiesgo(idPac,idPac,EnumFRiesgo.HIPERTENSION));
                   }
        }
        else System.exit(0);
    }
    
    public Paciente getPaciente(){
    return this.pac;
    }
    
    public ArrayList <FactoresRiesgo> getFactores(){
     return this.factores;
    }
}
