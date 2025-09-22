package gui.util;

import javafx.scene.control.Alert;

public class Alerts {
    public static void showAlert(String title, String header, String content, Alert.AlertType error) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();




    }
}
