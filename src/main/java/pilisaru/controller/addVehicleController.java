package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import pilisaru.dto.Vehicle;
import pilisaru.model.VehicleModel;

import java.sql.SQLException;

public class addVehicleController {
    @FXML
    private TextField txtWaight;
    @FXML
    private TextField txtCouncil;
    @FXML
    private Button btnButton;
    @FXML
    private TextField txtVehicleNumber;

    public void btnButtonOnAction(ActionEvent actionEvent) {

        try {
            boolean save = VehicleModel.save(new Vehicle(txtVehicleNumber.getText(), txtCouncil.getText(), txtWaight.getText()));
            if (save)
                new Alert(Alert.AlertType.CONFIRMATION,"vehicle saved !").show();
            else
                new Alert(Alert.AlertType.ERROR,"not saved !").show();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
