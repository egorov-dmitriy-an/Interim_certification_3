package AnimalsModel;

import java.util.LinkedList;
import java.util.List;

import ComandsModel.Comands;

public class Animals {
    private int id;
    private String name;
    private String bithData;
    private List<Comands> listComands = new LinkedList<>();

    public Animals(String name, String bithData) {
        this.name = name;
        this.bithData = bithData;
    }

    public void addComand(Comands comand) {
        listComands.add(comand);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBithData() {
        return bithData;
    }

    public List<Comands> getListComands() {
        return listComands;
    }

    

}
