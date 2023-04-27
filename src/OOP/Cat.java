package OOP;

public class Cat extends Feline{
    @Override
    void makeNoise() {
        System.out.println("makeNoise: Cat");
    }

    @Override
    void eat() {
        System.out.println("eat: Cat");
    }
}
