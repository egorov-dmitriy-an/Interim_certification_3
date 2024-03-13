package ComandsModel;

public class Submit_a_vote extends Comands{

    private String name;

    public Submit_a_vote() {
        this.name = "Голос";
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
