package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
        Machine machine=new Machine(machineIdTxt.getText(),machineNameTxt.getText());
        try {
            boolean addMachine= MachineModel.add(machine);
            if(addMachine){
                System.out.println("add");
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
