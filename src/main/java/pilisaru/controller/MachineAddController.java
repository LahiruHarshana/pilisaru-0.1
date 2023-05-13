package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import pilisaru.dto.Machine;
import pilisaru.model.MachineModel;

import java.sql.SQLException;

public class MachineAddController {
    @FXML
    private Button addBtn;

    @FXML
    private TextField machineIdTxt;

    @FXML
    private TextField machineNameTxt;

    @FXML
    void addBtnOnAction(ActionEvent event) {
        try {
            boolean addMachine= MachineModel.add(new Machine(machineIdTxt.getText(),machineNameTxt.getText()));
            if(addMachine){
                new Alert(Alert.AlertType.CONFIRMATION,"Added !").show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void machineIdTxtOnAction(ActionEvent event) {
        machineNameTxt.requestFocus();
    }

    @FXML
    void machineNameTxtOnAction(ActionEvent event) {
        addBtn.fire();
    }
}
