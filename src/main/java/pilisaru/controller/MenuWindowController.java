package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import pilisaru.util.Navigation;
import pilisaru.util.Rout;

import java.io.IOException;

public class MenuWindowController {
    @FXML
    private Button btnCompost;

    @FXML
    private MenuItem btnEmployeeAdd;

    @FXML
    private MenuItem btnEmployeeGetInfo;

    @FXML
    private MenuItem btnEmployeeUpdate;

    @FXML
    private MenuItem btnGetinfo;

    @FXML
    private MenuItem btnHelthUpdate;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnInventory;

    @FXML
    private MenuButton btnMenuHealth;

    @FXML
    private Button btnPile;

    @FXML
    private MenuItem btnSalaryGetInfo;

    @FXML
    private MenuItem btnSalaryUpdate;

    @FXML
    private Button btnSingOut;

    @FXML
    private MenuItem btnVehicalAdd;

    @FXML
    private MenuItem btnVehicalAdd1;

    @FXML
    private MenuItem btnVehicalUpdate;

    @FXML
    private MenuItem btnselesAddDetail;

    @FXML
    private MenuItem btnselesGetInfo;

    @FXML
    private AnchorPane mainAncorPane;

    @FXML
    private AnchorPane root;

    @FXML
    void btnCompostOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.COMPOST,mainAncorPane);
    }

    @FXML
    void btnEmployeeAddOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.ADD_EMP,mainAncorPane);
    }

    @FXML
    void btnEmployeeGetInfoOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.GET_EMP,mainAncorPane);
    }

    @FXML
    void btnEmployeeUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.UPDATE_EMP,mainAncorPane);
    }

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.HOME,mainAncorPane);
    }

    @FXML
    void btnInventoruOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_MAIN,mainAncorPane);
    }

    @FXML
    void btnPileOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.PILE,mainAncorPane);
    }

    @FXML
    void btnSalaryGetInfoOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.GET_SALARY,mainAncorPane);
    }

    @FXML
    void btnSalaryUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.UPDATE_SALARY,mainAncorPane);
    }

    @FXML
    void btnSingOutOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.LOGOUT,root);
    }

    @FXML
    void btnVehicalAddOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.ADD_VEH,mainAncorPane);
    }

    @FXML
    void btnVehicalGetInfoOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.GET_VEH,mainAncorPane);
    }

    @FXML
    void btnVehicalUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.UPD_VEH,mainAncorPane);
    }

    @FXML
    void btnselesGetInfoOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.ADD_Sale,mainAncorPane);
    }

    @FXML
    void btnseleseAddDetailOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.GET_Sale,mainAncorPane);
    }

    @FXML
    void menuHelthGetInfoOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.UPD_HEALTH,mainAncorPane);
    }

    @FXML
    void menuHelthUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.GET_HEALTH,mainAncorPane);
    }
}
