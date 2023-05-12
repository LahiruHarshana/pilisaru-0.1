package pilisaru.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Navigation {
    private static Pane root;
    public static void navigation(Rout rout,Pane root) throws IOException {
        Navigation.root = root;
        Navigation.root.getChildren().clear();
        Stage window = (Stage) Navigation.root.getScene().getWindow();
        switch (rout) {
            case LOGIN -> initUi("menuwindow/menuWindow.fxml");
            case COMPOST -> initUi("menuControllerCompost/compost.fxml");
            case ADD_EMP -> initUi("employe/addEmployee.fxml");
            case GET_EMP -> initUi("employe/employeeInfometion.fxml");
            case UPDATE_EMP -> initUi("employe/employeeDetailUpdate.fxml");
            case HOME -> initUi("homePage/homeForm.fxml");
            case INVENTORY_MAIN -> initUi("inventory/maininventory.fxml");
            case PILE -> initUi("pile/pileinterface.fxml");
        }
    }
    private static void initUi(String location) throws IOException {
        Navigation.root.getChildren().add(FXMLLoader.load(Objects.requireNonNull(Navigation.class.getResource("/view/" + location))));
    }
}


