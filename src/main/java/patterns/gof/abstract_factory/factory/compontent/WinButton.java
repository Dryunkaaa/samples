package patterns.gof.abstract_factory.factory.compontent;

import javafx.scene.control.Alert;

public class WinButton extends Button {

    public WinButton(String text) {
        super(text);
    }

    @Override
    public void handleMouseClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Hello from Windows Button");
        alert.showAndWait();
    }
}
