package OOP;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Lion();
        animals[1] = new Tiger();
        animals[2] = new Cat();
        animals[3] = new Hippo(12.5f);
        animals[4] = new Wolf();
        animals[5] = new Dog();

        for(Animal a : animals){
            System.out.println("----Animal " + a.getClass() + " ----" );
            if(a instanceof Hippo){
                System.out.println("Horn size: " + ((Hippo) a).getHornsSize());
            }
            a.roam();
            a.makeNoise();
            a.eat();
            a.sleep();
        }

        System.out.println("---------------------------------------");
        People[] peoples = new People[2];
        peoples[0] = new Student();
        peoples[1] = new Teacher();
        for(People p : peoples){
            System.out.println("----People " + p.getClass() + " ----" );
            p.getRole();
        }
        System.out.println("-------------------------");
        System.out.println((peoples[0] instanceof Student) ? "people[0] is a student" : "people[0] is NOT a student");
        System.out.println((peoples[1] instanceof Teacher) ? "people[1] is a teacher" : "people[1] is NOT a teacher");
    }
}
