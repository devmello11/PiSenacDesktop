package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.entities.Crud;

import java.net.URL;
import java.util.ResourceBundle;

public class CrudListController implements Initializable {
    @FXML
    private TableView<Crud> crudTableView;

    @FXML
    private TableColumn<Crud, Integer> tableColumnId;

    @FXML
    private TableColumn<Crud, String> tableColumnNome;

    @FXML
    private Button btNew;

    @FXML
    public void onBtNewAction() {
        System.out.println("onBtNewAction");
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }

    private void initializeNodes() {
    }
}
