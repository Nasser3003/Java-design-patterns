package org.abdo.factory;

public class AnimalFactory implements IAnimalFactory {
    @Override
    public IAnimals create(String type) {
        return switch (type) {
            case "Dog" -> new Dog();
            case "Cat" -> new Cat();
            case "Duck" -> new Duck();
            default -> null;
        };
    }
}
