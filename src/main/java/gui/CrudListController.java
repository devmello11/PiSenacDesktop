package gui;

import com.example.pisenacdesk.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Crud;
import modelo.serviços.DepartamentoServicos;

import java.net.URL;
import java.util.ResourceBundle;

public class CrudListController implements Initializable {


    private DepartamentoServicos servicos;


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
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("name"));

        Stage stage  = (Stage) Main.getMainScene().getWindow();
        crudTableView.prefHeightProperty().bind(stage.heightProperty());



    }
}
