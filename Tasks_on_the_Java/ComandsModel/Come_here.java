package ComandsModel;

public class Come_here extends Comands {

    private String name;

    public Come_here() {
        this.name = "Ко мне";
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
