package patterns.gof.abstract_factory.factory;


import patterns.gof.abstract_factory.factory.compontent.Button;

public interface AbstractFactory {

    Button createButton(String buttonText);
}
