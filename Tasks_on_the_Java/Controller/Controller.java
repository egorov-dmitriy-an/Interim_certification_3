package Controller;

import java.util.Scanner;

import AnimalsModel.Animals;
import AnimalsModel.Camel;
import AnimalsModel.Cat;
import AnimalsModel.Dog;
import AnimalsModel.Donkey;
import AnimalsModel.Horse;
import AnimalsModel.Humster;
import CounterModel.Counter;
import Model.ListAnimals;
import View.UserView;
import ComandsModel.*;

public class Controller {

    public void controller() {
        ListAnimals lAnimals = new ListAnimals();
        UserView userView = new UserView();
        Counter count = new Counter();
        Scanner scan = new Scanner(System.in);
        boolean status = true;

        while (status) {
            System.out.println("Menu:\n" +
                    "1. Завести новое животное\n" +
                    "2. Посмотреть список своих животных\n" +
                    "3. Информация о животном\n" +
                    "4. Обучить новой команде животное");
            System.out.print("Введите значение: ");
            int userEnter = scan.nextInt();
            switch (userEnter) {
                case 1: // Завести новое животное
                    System.out.println("Выберете вид: \n" +
                            "1. Кошка\n" +
                            "2. Собака\n" +
                            "3. Хомяк\n" +
                            "4. Осел\n" +
                            "5. Лошадь\n" +
                            "6. Верблюд\n" +
                            "7. Выход в предыдущее меню\n");
                    System.out.print("Введите значение: ");
                    userEnter = scan.nextInt();
                    switch (userEnter) {
                        case 1:
                            Cat cat = new Cat(userView.getName(), userView.getDate());
                            cat.setId(count.getId());
                            lAnimals.addAnimal(cat);
                            break;
                        case 2:
                            Dog dog = new Dog(userView.getName(), userView.getDate());
                            dog.setId(count.getId());
                            lAnimals.addAnimal(dog);
                            break;
                        case 3:
                            Humster humster = new Humster(userView.getName(), userView.getDate());
                            humster.setId(count.getId());
                            lAnimals.addAnimal(humster);
                            break;
                        case 4:
                            Donkey donkey = new Donkey(userView.getName(), userView.getDate());
                            donkey.setId(count.getId());
                            lAnimals.addAnimal(donkey);
                            break;
                        case 5:
                            Horse horse = new Horse(userView.getName(), userView.getDate());
                            horse.setId(count.getId());
                            lAnimals.addAnimal(horse);
                            break;
                        case 6:
                            Camel camel = new Camel(userView.getName(), userView.getDate());
                            camel.setId(count.getId());
                            lAnimals.addAnimal(camel);
                            break;
                        case 7:
                            break;

                    }
                    break;
                case 2: // Посмотреть список своих животных
                    userView.printListAnimals(lAnimals.getList_animals());
                    break;
                case 3: // Информация о животном
                    userView.printListAnimals(lAnimals.getList_animals());
                    System.out.print("Введите ID животного: ");
                    userEnter = scan.nextInt();
                    userView.printInfoOfAnimal(lAnimals.getList_animals().get(userEnter - 1));
                    break;
                case 4: // обучить новой команде
                    userView.printListAnimals(lAnimals.getList_animals());
                    System.out.print("Введите ID животного: ");
                    userEnter = scan.nextInt();
                    Animals animal = lAnimals.getList_animals().get(userEnter - 1);
                    System.out.println("Выберете команду: \n" +
                            "1. Ко мне\n" +
                            "2. Дай лапу\n" +
                            "3. Вперед\n" +
                            "4. Прыжок\n" +
                            "5. Сидеть\n" +
                            "6. Стой\n" +
                            "7. Голос\n" +
                            "8. Лежать\n" +
                            "9. Выход в предыдущее меню\n");
                    System.out.print("Введите значение: ");
                    userEnter = scan.nextInt();
                    switch (userEnter) {
                        case 1:
                            Come_here come_here = new Come_here();
                            animal.addComand(come_here);
                            break;
                        case 2:
                            Give_me_a_paw Give_me_a_paw = new Give_me_a_paw();
                            animal.addComand(Give_me_a_paw);
                            break;
                        case 3:
                            Go go = new Go();
                            animal.addComand(go);
                            break;
                        case 4:
                            Jump jump = new Jump();
                            animal.addComand(jump);
                            break;
                        case 5:
                            Seat seat = new Seat();
                            animal.addComand(seat);
                            break;
                        case 6:
                            Stop stop = new Stop();
                            animal.addComand(stop);
                            break;
                        case 7:
                            Submit_a_vote submit_a_vote = new Submit_a_vote();
                            animal.addComand(submit_a_vote);
                            break;
                        case 8:
                            To_lie to_lie = new To_lie();
                            animal.addComand(to_lie);
                            break;

                    }
            }

        }
    }

}