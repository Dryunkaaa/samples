package patterns.gof.abstract_factory.factory.compontent;

import javafx.scene.control.Alert;

public class LinuxButton extends Button {

    public LinuxButton(String text) {
        super(text);
    }

    @Override
    public void handleMouseClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Hello from Linux Button");
        alert.showAndWait();
    }
}
