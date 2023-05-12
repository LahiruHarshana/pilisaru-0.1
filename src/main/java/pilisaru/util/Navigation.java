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
            case INVENTORY_COM_UP -> initUi("inventory/compost/compostUpdate.fxml");
            case INVENTORY_COM_GET -> initUi("inventory/compost/compostGetInfo.fxml");
            case INVENTORY_ADD_EMP -> initUi("inventory/employeeEquipment/equipmentAdd.fxml");
            case INVENTORY_DELETE_EMP -> initUi("inventory/employeeEquipment/equipentDelete.fxml");
            case INVENTORY_UP_EMP -> initUi("inventory/employeeEquipment/employeeEqupmentUpdate.fxml");
            case INVENTORY_CHEM_ADD -> initUi("inventory/chemcal/cemicalAdd.fxml");
            case INVENTORY_CHEM_DELETE -> initUi("inventory/chemcal/cemicalDelete.fxml");
            case INVENTORY_CHEM_UPDATE -> initUi("inventory/chemcal/cemicalUpdate.fxml");
            case INVENTORY_SITE_VEHICLE_ADD -> initUi("inventory/siteVehicle/siteaddVehicle.fxml");
            case INVENTORY_SITE_VEHICLE_DELETE -> initUi("inventory/siteVehicle/siteVehicleDelete.fxml");
            case INVENTORY_SITE_VEHICLE_UP -> initUi("inventory/siteVehicle/siteVehicleDetailUpdate.fxml");
            case INVENTORY_MACHINE_UP -> initUi("inventory/machine/machineUdate.fxml");
            case INVENTORY_MACHINE_ADD -> initUi("inventory/machine/machineAdd.fxml");
            case INVENTORY_MACHINE_DELETE -> initUi("inventory/machine/machineDelete.fxml");
        }
    }
    private static void initUi(String location) throws IOException {
        Navigation.root.getChildren().add(FXMLLoader.load(Objects.requireNonNull(Navigation.class.getResource("/view/" + location))));
    }
}


