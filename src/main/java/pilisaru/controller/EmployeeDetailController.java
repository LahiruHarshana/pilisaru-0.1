package pilisaru.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import pilisaru.model.EmployeeModel;

import java.sql.SQLException;
import java.util.List;

public class EmployeeDetailController {
    public ComboBox cmbYear;
    public ComboBox cmbEmpNic;

    @FXML
    void initialize(){

    }
    private void setNicNUmbers() {
        ObservableList nic= FXCollections.observableArrayList();
        try {
            List<String> nics= EmployeeModel.getNicNumbers();

            for(String s : nics){
                nic.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cmbEmpNic.setItems(nic);
    }
}
