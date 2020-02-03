package patterns.gof.abstract_factory.factory;

import patterns.gof.abstract_factory.factory.compontent.Button;
import patterns.gof.abstract_factory.factory.compontent.LinuxButton;

public class LinuxFactory implements AbstractFactory {

    @Override
    public Button createButton(String buttonText) {
        return new LinuxButton(buttonText);
    }
}
