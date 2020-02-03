package patterns.gof.abstract_factory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import patterns.gof.abstract_factory.factory.AbstractFactory;
import patterns.gof.abstract_factory.factory.LinuxFactory;
import patterns.gof.abstract_factory.factory.compontent.Button;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        AbstractFactory abstractFactory = new LinuxFactory();
        Button myButton = abstractFactory.createButton("Click me!");
        root.getChildren().add(myButton);
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }
}
