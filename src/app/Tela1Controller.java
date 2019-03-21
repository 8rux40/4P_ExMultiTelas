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
 * @author btardin
 */
public class Tela1Controller implements Initializable {
    
    @FXML
    private Button btnChamarTela2;
    
    @FXML
    private void onBtnChamarTela2Action(){
        TelasController.chamarTela(getClass().getResource("Tela2.fxml"));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
