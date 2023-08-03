import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view/login/LoginForm.fxml")));
        Image image=new Image("assets/systemLogo/pilisaruLogo.png");
        stage.getIcons().add(image);
        stage.setScene(new Scene(parent));
        stage.setTitle("Pilisaru");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }
    void test(){}
    //test
}
