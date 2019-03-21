package app;

import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author btardin
 */
public class TelasController {
    public static void chamarTela(URL telaUrl) {
        try {
            FXMLLoader loader = new FXMLLoader(telaUrl);
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro ao chamar tela!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
