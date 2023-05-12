package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import pilisaru.dto.Employee;
import pilisaru.model.EmployeeModel;

public class AddEmployeeController {
    @FXML
    private TextField txtEmpNic;
    @FXML
    private TextField txtEmpName;
    @FXML
    private TextField txtEmpAddress;
    @FXML
    private Button btnAdd;

    public void btnAddOnAction(ActionEvent event) {
        String nic=txtEmpNic.getText();
        String name = txtEmpName.getText();
        String address = txtEmpAddress.getText();

        try {
            boolean save = EmployeeModel.save(new Employee(
                    nic, name, address
            ));

            if (save) {
                new Alert(Alert.AlertType.CONFIRMATION, "Success !").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "not added ! !").show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
