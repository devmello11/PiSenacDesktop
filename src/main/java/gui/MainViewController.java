package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private MenuItem menuItemUsuarios;
    @FXML
    private MenuItem menuItemEventos;
    @FXML
    private MenuItem menuItemAdm;
    @FXML
    private MenuItem menuItemEnderecos;
    @FXML
    private MenuItem menuItemColaboradores;
    @FXML
    private MenuItem menuItemClientes;

    public void onMenuItemUsuariosAction() {
        System.out.println("Menu Item Usuarios clicked");
    }
    public void onMenuItemEventosAction() {
        System.out.println("Menu Item Eventos clicked");
    }
    public void onMenuItemAdmAction() {
        System.out.println("Menu Item Adm clicked");
    }
    public void onMenuItemEnderecoAction() {
        System.out.println("Menu Item Enderecos clicked");
    }
    public void onMenuItemColaboradoresAction() {
        System.out.println("Menu Item Colaboradores clicked");
    }
    public void onMenuItemClientesAction() {
        System.out.println("Menu Item Clientes clicked");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }
}
