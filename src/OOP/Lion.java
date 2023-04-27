package OOP;

public class Lion extends Feline{
    @Override
    void makeNoise() {
        System.out.println("makeNoise: Lion");
    }

    @Override
    void eat() {
        System.out.println("eat: Lion");
    }
}
