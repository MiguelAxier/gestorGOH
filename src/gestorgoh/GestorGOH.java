/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorgoh;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author H
 */
public class GestorGOH extends Application {
    private ControladorVentanaPrincipal ventanaPrincipal;
    private Parent root;
    private String nombre;
    
    @Override
    public void start(Stage stage) throws Exception {
        abrirVentanaLogin();
    }
    
    public void abrirVentanaLogin (){
        
        try {
            root = FXMLLoader.load(getClass().getResource("ventanaLogin.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(GestorGOH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void abrirVentanaPrincipal (){
        try {
            root = FXMLLoader.load(getClass().getResource("ventanaPrincipal.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(GestorGOH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void mandarDatos(String nombre){
        this.nombre=nombre;      
    }
    public String getDatos(){
        return nombre;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    /*
    public boolean verificarUsuario (String nombre, String pass){
        manager = new manager ();
            if(manager.verificarUsuario(nombre,pass)){
                //TODO
                return true;
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Usuario y/o contraseña incorrectos");
                return false;
            }
    }
*/
    
}
