import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view/login/LoginForm.fxml")));
        stage.setScene(new Scene(parent));
        stage.setTitle("Pilisaru");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

}
