package chat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ChatController {
    @FXML
    private TextField chatTextField;

    @FXML
    void intoMenu(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/start.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.mainStage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void intoCall(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/call.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Main.mainStage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
