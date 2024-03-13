package View;

import java.util.List;
import java.util.Scanner;

import AnimalsModel.Animals;
import ComandsModel.Comands;
import Model.ListAnimals;

public class UserView {
    Scanner scan = new Scanner(System.in);

    public String getName(){
        System.out.println("Введите имя: ");
        String name = scan.nextLine();
        return name;
    }

    public String getDate(){
        System.out.println("Введите дату рождения: ");
        String birthDate = scan.nextLine();
        return birthDate;
    }

    public void printListAnimals(List<Animals> animals){
        for (Animals animal : animals){
            System.out.printf("%s, %s", animal.getId(), animal.getName());
        }
    }

    public void printListComands(List<Comands> comands){
        for (Comands comand : comands){
            System.out.printf("%s", comand.getName());
        }
    }

    public void printInfoOfAnimal(Animals animal){
        System.out.print(animal.getName() + ", " + animal.getBithData() + "\nКоманды: " + 
                                animal.getListComands());
    }
}
