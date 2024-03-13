package ComandsModel;

public class Go extends Comands {

    private String name;

    public Go() {
        this.name = "Вперед";
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
