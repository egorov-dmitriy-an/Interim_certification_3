package ComandsModel;

public class Stop extends Comands {

    private String name;

    public Stop() {
        this.name = "Стой";
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
