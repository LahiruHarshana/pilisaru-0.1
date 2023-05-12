package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import pilisaru.util.Navigation;
import pilisaru.util.Rout;

import java.io.IOException;

public class LoginController {

    public AnchorPane mainframethisWindow;
    Pane registerPane;

    public void txtPasswordOnAction(ActionEvent event) {
    }

    public void passOnActionKeyTyped(KeyEvent keyEvent) {
    }

    public void btnSingInOnAction(ActionEvent event) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/menuwindow/menuWindow.fxml"));
//        registerPane = fxmlLoader.load();
//        mainframethisWindow.getChildren().clear();
//        mainframethisWindow.getChildren().setAll(registerPane);
        Navigation.navigation(Rout.LOGIN,mainframethisWindow);
    }

    public void forgetsOnAction(ActionEvent event) {
    }
}
