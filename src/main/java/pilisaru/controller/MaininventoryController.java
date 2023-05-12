package pilisaru.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import pilisaru.util.Navigation;
import pilisaru.util.Rout;

import java.io.IOException;

public class MaininventoryController {
    @FXML
    private AnchorPane inventoryPane;
    public void btnInventoryCompostUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_COM_UP, inventoryPane);
    }

    public void btnInventoryCompostInformationOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_COM_GET, inventoryPane);
    }

    public void btnEmployeeEquipmentUpdateOnAction(ActionEvent event) {
    }

    public void btnEmployeeEquipmentDeleteOnAction(ActionEvent event) {
    }

    public void btnEmployeeEquipmentOnAction(ActionEvent event) {
    }

    public void btnInventoryCemicalUpdateOnAction(ActionEvent event) {
    }

    public void btnInventoryCemicalDelete(ActionEvent event) {
    }

    public void btnInventoryCemicalAddOnAction(ActionEvent event) {
    }

    public void btnSiteVehicalUpdateOnAction(ActionEvent event) {
    }

    public void btnSiteVehicalDeleteOnAction(ActionEvent event) {
    }

    public void btnSitevehicalAddOnAction(ActionEvent event) {
    }

    public void btnInventoryMachinUpdateOnAction(ActionEvent event) {
    }

    public void btnInventoryMachineDeleteOnAction(ActionEvent event) {
    }

    public void setBtnInventoryMachineUpdateOnAction(ActionEvent event) {
    }
}
