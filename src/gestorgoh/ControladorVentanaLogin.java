/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorgoh;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author H
 */
public class ControladorVentanaLogin {
    @FXML
    private Button btnEntrar;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField pfPass;
    @FXML
    private Label lbBtnNuevoUsuario;
    private GestorGOH gestor;
    private String nombre;
    private ControladorVentanaPrincipal ventanaPrincipal;

    
    @FXML
    public void handleBtnEntrar (ActionEvent event) throws IOException{
        if(txtUsuario.getText().trim().equals("") || pfPass.getText().trim().equals("")){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Los campos USUARIO y CONTRASEÑA son obligatorios.");
            alert.show();
        } else {
                try {
            Parent root = FXMLLoader.load(getClass().getResource("ventanaPrincipal.fxml"));
           
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            
            
            /*nombre=txtUsuario.getText();
            System.out.println(nombre);
            ventanaPrincipal = new ControladorVentanaPrincipal(nombre);
            ventanaPrincipal.setDatos(nombre);
            */
            stage.show();
            nombre = txtUsuario.getText();
            ventanaPrincipal.setDatos(nombre);
            
        } catch (IOException ex) {
            Logger.getLogger(GestorGOH.class.getName()).log(Level.SEVERE, null, ex);
        }
            /*gestor = new GestorGOH();
            nombre=txtUsuario.getText();
            System.out.println(nombre);
            
            gestor.abrirVentanaPrincipal();
            gestor.mandarDatos(nombre);*/
            
            ((Stage)btnEntrar.getScene().getWindow()).close();
        }

    }
    
    public void handleLblNuevoUsuario(ActionEvent event){

    }
    
}
