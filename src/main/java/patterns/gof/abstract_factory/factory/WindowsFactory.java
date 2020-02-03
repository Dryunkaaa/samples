package patterns.gof.abstract_factory.factory;

import patterns.gof.abstract_factory.factory.compontent.Button;
import patterns.gof.abstract_factory.factory.compontent.WinButton;

public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton(String buttonText) {
        return new WinButton(buttonText);
    }
}
