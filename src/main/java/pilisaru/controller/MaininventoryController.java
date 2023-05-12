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

    public void btnEmployeeEquipmentUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_UP_EMP,inventoryPane);
    }

    public void btnEmployeeEquipmentDeleteOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_DELETE_EMP,inventoryPane);
    }

    public void btnEmployeeEquipmentOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_ADD_EMP,inventoryPane);
    }

    public void btnInventoryCemicalUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_CHEM_UPDATE,inventoryPane);
    }

    public void btnInventoryCemicalDelete(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_CHEM_DELETE,inventoryPane);
    }

    public void btnInventoryCemicalAddOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_CHEM_ADD,inventoryPane);
    }

    public void btnSiteVehicalUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_SITE_VEHICLE_UP,inventoryPane);
    }

    public void btnSiteVehicalDeleteOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_SITE_VEHICLE_DELETE,inventoryPane);
    }

    public void btnSitevehicalAddOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_SITE_VEHICLE_ADD, inventoryPane);
    }

    public void btnInventoryMachinUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_MACHINE_UP,inventoryPane);
    }

    public void btnInventoryMachineDeleteOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_MACHINE_DELETE,inventoryPane);
    }

    public void setBtnInventoryMachineUpdateOnAction(ActionEvent event) throws IOException {
        Navigation.navigation(Rout.INVENTORY_MACHINE_ADD,inventoryPane);
    }
}
