package ComandsModel;

public class Give_me_a_paw extends Comands {

    private String name;

    public Give_me_a_paw() {
        this.name = "Дай лапу";
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
