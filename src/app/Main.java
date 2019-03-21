package app;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author btardin
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        TelasController.chamarTela(getClass().getResource("Tela1.fxml"));
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
