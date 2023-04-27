package OOP;

public class Hippo extends Animal{
    private float hornSize;

    public Hippo(float hornSize) {
        super();
        this.hornSize = hornSize;
    }

    @Override
    void makeNoise() {
        System.out.println("makeNoise: Hippo");
    }

    @Override
    void eat() {
        System.out.println("eat: Hippo");
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println("sleep: Animals and Hippo");
    }

    float getHornsSize(){
        return hornSize;
    }
}
