package ComandsModel;

public class Jump extends Comands {

    private String name;

    public Jump() {
        this.name = "Прыжок!";
    }

    
    @Override
    public void go() {
        System.out.println("");
    }


    public String getName() {
        return name;
    }
    
}
