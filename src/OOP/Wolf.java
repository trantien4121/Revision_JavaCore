package OOP;

public class Wolf extends Canine{
    @Override
    void makeNoise() {
        System.out.println("makeNoise: Wolf");
    }

    @Override
    void eat() {
        System.out.println("eat: Wolf");
    }
}
