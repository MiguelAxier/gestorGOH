/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorgoh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author H
 */
public class ControladorVentanaPrincipal {
    @FXML
    private Button btnPersonajes, btnModificadores, btnNaves;
    @FXML
    private Label lblNombreUsuario;
   // private GestorGOH gestor;
    private String nombre;
        GestorGOH gestor = new GestorGOH();
        
        
        
        public void setDatos(String nombre){
            System.out.println(nombre);
            this.nombre=nombre;
            //lblNombreUsuario.setText("Pues mira que bien");
           //lblNombreUsuario.setText(this.nombre);
        }
    
        
    
        public void handleBtn (ActionEvent event){
            if(event.getTarget().equals(btnPersonajes)){
              lblNombreUsuario.setText("mira que bien");
            }
            if(event.getTarget().equals(btnModificadores)){
                System.out.println(nombre);
                lblNombreUsuario.setText(nombre);
            }
            if(event.getTarget().equals(btnNaves)){
                
            }
        }
        
        
}
