package chat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class CallController {
    @FXML
    void intoMenu(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/main/resources/FXML/chat.fxml"));
            Scene scene = new Scene(loader.load());
            Main.mainStage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
