package Model;

import java.util.LinkedList;
import java.util.List;

import AnimalsModel.Animals;

public class ListAnimals {

    private List<Animals> list_animals = new LinkedList<>();

    public void addAnimal(Animals animals) {
        list_animals.add(animals);
    }

    public List<Animals> getList_animals() {
        return list_animals;
    }

}
