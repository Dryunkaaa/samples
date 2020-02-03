package patterns.gof.abstract_factory.factory.compontent;

import javafx.scene.control.Alert;

public class MacButton extends Button {

    public MacButton(String text) {
        super(text);
    }

    @Override
    public void handleMouseClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Hello from Mac Button");
        alert.showAndWait();
    }
}
