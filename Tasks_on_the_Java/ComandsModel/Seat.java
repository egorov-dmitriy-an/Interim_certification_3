package ComandsModel;

public class Seat extends Comands{

    private String name;

    public Seat() {
        this.name = "Сидеть";
    }

    @Override
    public void go() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'go'");
    }

    public String getName() {
        return name;
    }
    
}
