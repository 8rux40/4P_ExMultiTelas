/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Lab1
 */
public class Tela1Controller implements Initializable {
    
    @FXML
    private Button btnChamarTela2;
    
    @FXML
    private void onBtnChamarTela2Action(){
        try {
            TelasController.chamarTela(getClass().getResource("Tela2.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(Tela1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
