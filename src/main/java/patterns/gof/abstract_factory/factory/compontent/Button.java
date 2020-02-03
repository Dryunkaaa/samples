package patterns.gof.abstract_factory.factory.compontent;

public abstract class Button extends javafx.scene.control.Button {

    public abstract void handleMouseClick();

    public Button(String text) {
        super(text);
        this.setPrefSize(100, 30);
        this.setTranslateX(10);
        this.setTranslateY(10);
        this.setOnAction(event -> this.handleMouseClick());
    }
}
