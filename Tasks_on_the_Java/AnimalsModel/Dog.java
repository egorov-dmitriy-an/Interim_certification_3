package AnimalsModel;



public class Dog extends Pet_animals{

    private String kind_name;

    public Dog(String name, String bithData) {
        super(name, bithData);
        this.kind_name = "Dog";
    }
    
}
