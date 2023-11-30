package org.abdo.factory;

public class AnimalFactory implements IAnimalFactory {
    @Override
    public IAnimals create(String type) {
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            case "Duck":
                return new Duck();
        }
        return null;
    }
}
