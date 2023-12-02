package chat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private AnchorPane MenuPane;

    @FXML
    private Button startButton;

    @FXML
    void intoChat(MouseEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/chat.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.mainStage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}