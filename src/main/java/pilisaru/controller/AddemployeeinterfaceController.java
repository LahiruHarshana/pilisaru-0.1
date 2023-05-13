package pilisaru.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import pilisaru.dto.Employee;
import pilisaru.model.EmployeeModel;

import java.sql.SQLException;
import java.util.List;

public class AddemployeeinterfaceController {
    public ComboBox cmbNic;
    public TextField txtEmpName;
    public TextField txtEmpAddress;

    @FXML
    void initialize(){
        setNicNUmbers();
    }

    private void setNicNUmbers() {
        ObservableList nic= FXCollections.observableArrayList();
        try {
            List<String> nics=EmployeeModel.getNicNumbers();

            for(String s : nics){
                nic.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cmbNic.setItems(nic);
    }


    public void cmbNicOnAction(ActionEvent event) {
        String nic = (String) cmbNic.getValue();

        try {
            Employee employee= EmployeeModel.getAll(nic);
            txtEmpName.setText(employee.getName());
            txtEmpAddress.setText(employee.getAddress());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
