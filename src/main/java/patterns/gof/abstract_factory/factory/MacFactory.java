package patterns.gof.abstract_factory.factory;

import patterns.gof.abstract_factory.factory.compontent.Button;
import patterns.gof.abstract_factory.factory.compontent.MacButton;

public class MacFactory implements AbstractFactory{

    @Override
    public Button createButton(String buttonText) {
        return new MacButton(buttonText);
    }
}
