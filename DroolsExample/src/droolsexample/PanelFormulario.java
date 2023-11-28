/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelFormulario extends JFrame implements ActionListener {
    private JFrame frame;
       private  Container contentpane;
     private boolean accionCompletada;
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
       private ButtonGroup buttonGroup;
      private Paciente pac;
     private ArrayList <FactoresRiesgo> factores;
     private JPanel pane;
      
public  PanelFormulario(){
    frame=new JFrame();
     frame.setSize(400,400);  
   contentpane = getContentPane();
          GridBagConstraints c = new GridBagConstraints();
           c.fill = GridBagConstraints.CENTER;
            Font fontRadioButton = new Font("Arial", Font.PLAIN, 20);
        panelFormulario= new JPanel(new GridBagLayout());
         panelAtributos = new JPanel(new GridLayout(10,2));
         JLabel tituloPanelFormulario= new JLabel("DATOS PERSONALES");
         tituloPanelFormulario.setFont(new Font("Serif", Font.BOLD, 36));
       tituloPanelFormulario.setHorizontalAlignment(SwingConstants.CENTER);
        panelAtributos.add(tituloPanelFormulario);
        panelAtributos.add(new JLabel(""));
        JLabel labelId = new JLabel(" IDENTIFICADOR:");
        labelId.setFont(new Font("Arial", Font.BOLD, 26));
         panelAtributos.add(labelId);
       texto3 = new JTextField(10);
        panelAtributos.add(texto3);
        JLabel labelNombre = new JLabel(" NOMBRE Y APELLIDOS:");
        labelNombre.setFont(new Font("Arial", Font.BOLD, 26));
         panelAtributos.add(labelNombre);
       texto1 = new JTextField(50);
        panelAtributos.add(texto1);
        JLabel labelEdad = new JLabel(" EDAD:");
        labelEdad.setFont(new Font("Arial", Font.BOLD, 26));
        panelAtributos.add(labelEdad);
        texto2 = new JTextField(3);
        panelAtributos.add(texto2);
        JLabel labelSexo = new JLabel(" SEXO:");
        labelSexo.setFont(new Font("Arial", Font.BOLD, 26));
        panelAtributos.add(labelSexo);
        JPanel panelSexo = new JPanel(new GridLayout(1,2));
        buttonGroup = new ButtonGroup();
        femBoton=new JRadioButton("Femenino");
         mascBoton=new JRadioButton("Masculino");
         femBoton.setFont(fontRadioButton);
         mascBoton.setFont(fontRadioButton);
         buttonGroup.add(femBoton);
        buttonGroup.add(mascBoton);
       panelSexo.add(femBoton);
        panelSexo.add(mascBoton);
        panelAtributos.add(panelSexo);
        JLabel labelFactores = new JLabel(" FACTORES DE RIESGO:");
        labelFactores.setFont(new Font("Arial", Font.BOLD, 26));
        panelAtributos.add(labelFactores);
        JPanel panelFactoresRiesgo = new JPanel(new GridLayout(2,6));
        GridBagConstraints c2 = new GridBagConstraints();
        c2.fill = GridBagConstraints.HORIZONTAL;  
        radio1=new JRadioButton("H. Familiar");
        radio1.setFont(fontRadioButton);
        radio2=new JRadioButton("Tabaquismo");
        radio2.setFont(fontRadioButton);
        radio3=new JRadioButton("Diabetes");
        radio3.setFont(fontRadioButton);
        radio4=new JRadioButton("Colesterol Alto");
        radio4.setFont(fontRadioButton);
        radio5=new JRadioButton("Obesidad");
        radio5.setFont(fontRadioButton);
        radio6=new JRadioButton("Hipertensión");
        radio6.setFont(fontRadioButton);
       panelFactoresRiesgo.add(radio1);
       panelFactoresRiesgo.add(radio2);
       panelFactoresRiesgo.add(radio3);
       panelFactoresRiesgo.add(radio4);
       panelFactoresRiesgo.add(radio5);
       panelFactoresRiesgo.add(radio6);
       c2.gridwidth = 2;
       panelAtributos.add(panelFactoresRiesgo,c2);
        panelFormulario.add(panelAtributos,c);
       pane = new JPanel(new GridBagLayout());
       c.fill = GridBagConstraints.HORIZONTAL;  
c.anchor = GridBagConstraints.PAGE_END;       
       salir= new JButton ("Exit");
        salir.addActionListener(this);
      pane.add(salir);
       aceptar= new JButton ("Aceptar"); 
        aceptar.addActionListener(this);
       pane.add(aceptar);
          panelFormulario.add(pane,c);
         contentpane.add(panelFormulario);
 
         
    } 
   
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
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
             UUID uuid = UUID.randomUUID();
           factores.add(new FactoresRiesgo(uuid,idPac,EnumFRiesgo.HISTORIAL_FAMILIAR));}
          if (radio2.isSelected()){
              UUID uuid = UUID.randomUUID();
           factores.add(new FactoresRiesgo(uuid,idPac,EnumFRiesgo.TABAQUISMO));
         } 
                  if (radio3.isSelected()){
                      UUID uuid = UUID.randomUUID();
           factores.add( new FactoresRiesgo(uuid,idPac,EnumFRiesgo.DIABETES));} 
                  if (radio4.isSelected()){
                      UUID uuid = UUID.randomUUID();
          factores.add(new FactoresRiesgo(uuid,idPac,EnumFRiesgo.COLESTEROL_ELEVADO));} 
                   if (radio5.isSelected()){
                       UUID uuid = UUID.randomUUID();
           factores.add(new FactoresRiesgo(uuid,idPac,EnumFRiesgo.OBESIDAD));} 
                   if  (radio6.isSelected()){
                       UUID uuid = UUID.randomUUID();
                      factores.add(new FactoresRiesgo(uuid,idPac,EnumFRiesgo.HIPERTENSION));
                   }
                    accionCompletada = true;
                        }
        else System.exit(0);}
        catch(Exception ex){
        JOptionPane.showMessageDialog(frame,
    "Algún campo está vacío o es erróneo",
    "Inane error",
    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Paciente getPaciente(){
    return this.pac;
    }
    
    public ArrayList <FactoresRiesgo> getFactores(){
     return this.factores;
    }
     public boolean isAccionCompletada() {
        return accionCompletada;
    }
}
