package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author btardin
 */
public class Tela2Controller implements Initializable {

    private String valor;
    @FXML
    private Label lblValor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
        lblValor.setText(valor);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
