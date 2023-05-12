package pilisaru.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MaininventoryController {
    public Button btninventoryMachine;
    public Pane inventoryPane;
    public Button btnInventoryDelete;
    public Button btnInventoryMachineUpdate;
    public Button btnSitevehicalAdd;
    public Button btnSiteVehicalDelete;
    public Button btnSiteVehicalUpdate;
    public Button btnEmployeeEquipment;
    public Button btnEmployeeEquipmentDelete;
    public Button btnEmployeeEquipmentUpdate;
    public Button btnInventoryChemicalAdd;
    public Button btnInventoryChemicalDelete;
    public Button btnInventoryCemicalUpdate;
    public Button btnInventoryCemicalIncormation;
    public Button btnInventoryCompostUpdate;

    public void setBtnInventoryMachineUpdateOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/machine/machineAdd.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryMachineDeleteOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/machine/machineDelete.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryMachinUpdateOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/machine/machineUdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSitevehicalAddOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/siteVehicle/siteaddVehicle.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSiteVehicalDeleteOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/siteVehicle/siteVehicleDelete.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSiteVehicalUpdateOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/siteVehicle/siteVehicleDetailUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnEmployeeEquipmentOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/employeeEquipment/equipmentAdd.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnEmployeeEquipmentDeleteOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/employeeEquipment/equipentDelete.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnEmployeeEquipmentUpdateOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/employeeEquipment/employeeEqupmentUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCemicalAddOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/chemcal/cemicalAdd.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCemicalDelete() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/chemcal/cemicalDelete.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCemicalUpdateOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/chemcal/cemicalUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCompostInformationOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/compost/compostGetInfo.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCompostUpdateOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../../resources/view/inventory/compost/compostUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
