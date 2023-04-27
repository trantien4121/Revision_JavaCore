package OOP;

public class Dog extends Canine{
    @Override
    void makeNoise() {
        System.out.println("makeNoise: Dog");
    }

    @Override
    void eat() {
        System.out.println("eat: Dog");
    }
}
