/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PanelDiagnostico extends JFrame  {
    private JFrame frame;
    private JPanel panelFinal;
    private JTextArea areaDiagnostico;
    private  Container contentpane;
    private JTable tabla;
    private DefaultTableModel modelo;
    private String[] atributos;
    
    public PanelDiagnostico() {
        frame=new JFrame();
         contentpane = getContentPane();
      panelFinal= new JPanel(new BorderLayout());
 areaDiagnostico = new JTextArea(40, 80); 
         Font font = new Font("Arial", Font.BOLD, 16);
        areaDiagnostico.setFont(font);
        areaDiagnostico.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(areaDiagnostico);
         scrollPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelFinal.add(scrollPane, BorderLayout.PAGE_START);
       contentpane.add(panelFinal);
    }
    
     public void setDiagnostico(Diagnostico diagnostico) {
        String diagnosticoString = diagnostico.toString();
areaDiagnostico.setText(diagnosticoString);

    }
}
