package pilisaru.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import pilisaru.dto.Employee;
import pilisaru.model.EmployeeModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HomeWindowController {
    public ComboBox cmbNic;
    public Button btnUpdate;
    public TextField txtEmpName;
    public TextField txtAddress;
    public Button btnDelete;

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

    public void btnUpdateOnAction(ActionEvent event) {
        String nic =(String) cmbNic.getValue();
        String address = txtAddress.getText();
        String name = txtEmpName.getText();

        try {
            boolean isUpdate= EmployeeModel.update(new Employee(nic,address,name));

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION,"Success !").show();
            }else {
                new Alert(Alert.AlertType.ERROR,"SQL Error !").show();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cmbNicOnAction(ActionEvent event) {
        String nic = (String) cmbNic.getValue();

        try {
            Employee employee=EmployeeModel.getAll(nic);
            txtEmpName.setText(employee.getName());
            txtAddress.setText(employee.getAddress());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void btnDeleteOnAction(ActionEvent event) {
        String nic = (String) cmbNic.getValue();

        try {
            boolean isDeleted=EmployeeModel.delete(nic);
            if (isDeleted){
                new Alert(Alert.AlertType.CONFIRMATION,"Success !").show();
            }else {
                System.out.println("SQL ERROR !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        initialize();
    }
}
