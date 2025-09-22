package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;


import java.io.IOException;
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
    @FXML
    private MenuItem menuItemConfig;
    @FXML
    private MenuItem menuSuporte;

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
    public void onMenuItemConfigAction() {
        System.out.println("Menu Item Config clicked");
    }
    public void onMenuItemSuporteAction() {
        System.out.println("Menu Item Suporte clicked");
    }


    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }
    private void loadView(String absoluteName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            Vbox newVbox = loader.load();
            Scene mainScene = Main.getMainScene();
        }
        catch (IOException e){
            Alerts.showAlert("IO Exception", "Erro carregamento", e.getMessage(), Alert.AlertType.ERROR);
        }

    }

}
