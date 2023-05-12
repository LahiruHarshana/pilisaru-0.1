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
            case GET_SALARY -> initUi("salary/salaryForm.fxml");
            case UPDATE_SALARY -> initUi("salary/salaryUpdateForm.fxml");
            case LOGOUT -> initUi("login/LoginForm.fxml");
            case ADD_VEH -> initUi("vehical/addVehicle.fxml");
            case GET_VEH -> initUi("vehical/vehicleInformation.fxml");
            case UPD_VEH  -> initUi("vehical/updateVehicle.fxml");
            case ADD_Sale -> initUi("sales/addForm.fxml");
            case GET_Sale -> initUi("sales/salesForm.fxml");
            case UPD_HEALTH -> initUi("health/employeeForm.fxml");
            case GET_HEALTH-> initUi("health/addForm.fxml");
        }
    }
    private static void initUi(String location) throws IOException {
        Navigation.root.getChildren().add(FXMLLoader.load(Objects.requireNonNull(Navigation.class.getResource("/view/" + location))));
    }
}


