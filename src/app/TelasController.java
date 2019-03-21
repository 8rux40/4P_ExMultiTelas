package app;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lab1
 */
public class TelasController {
    public static void chamarTela(URL telaUrl) throws IOException {
        Parent root = FXMLLoader.load(telaUrl);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
