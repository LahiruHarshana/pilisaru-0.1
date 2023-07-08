package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
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
            VehicleModel.update(new Vehicle(cmbVehicleNum.getValue()+"",txtCouncil.getText(),String.valueOf(txtWeight.getValue())));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void cmbVehicleNumOnAction(ActionEvent actionEvent) {
        VehicleModel.getNumWise(cmbVehicleNum.getValue()+"");
    }
}
