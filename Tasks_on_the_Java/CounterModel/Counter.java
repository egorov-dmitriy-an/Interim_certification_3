package CounterModel;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getId(){
        count++;
        return count;
    }
    
}
