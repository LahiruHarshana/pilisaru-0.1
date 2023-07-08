package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import pilisaru.dto.Vehicle;
import pilisaru.model.VehicleModel;

import java.sql.SQLException;

public class updateController {
    public ChoiceBox txtWeight;
    public TextField txtCouncil;
    public Button btnUpdate;
    public ComboBox cmbVehicleNum;

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        try {
            boolean update = VehicleModel.update(new Vehicle(cmbVehicleNum.getValue() + "", txtCouncil.getText(), String.valueOf(txtWeight.getValue())));
            if (update)
                new Alert(Alert.AlertType.CONFIRMATION,"updated !").show();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void cmbVehicleNumOnAction(ActionEvent actionEvent) {
        try {
            Vehicle numWise = VehicleModel.getNumWise(cmbVehicleNum.getValue() + "");
            txtCouncil.setText(numWise.getWaigth());
            txtWeight.setValue(numWise.getWaigth());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
