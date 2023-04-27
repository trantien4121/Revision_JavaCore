package OOP;

public abstract class Animal {
    private String picture;
    private String food;
    private String location;

    public Animal(){};

    abstract void makeNoise();
    abstract void eat();
    void sleep(){
        System.out.println("sleep: Animal");
    }
    void roam(){
        System.out.println("roam: Animal");
    };

}
