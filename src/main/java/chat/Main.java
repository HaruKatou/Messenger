package chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Stage mainStage;
    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/start.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainStage.setResizable(false);
        mainStage.setTitle("Messenger");
        mainStage.setScene(scene);

        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
