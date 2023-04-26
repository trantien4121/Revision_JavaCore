package NestedClass;

public class AnonymousClass {
    interface Output{
        void print();
    }

    class Outer{
        void display() {
            Output output = new Output() {
                @Override
                public void print() {
                    System.out.println("This is Anonymous Class");
                }
            };

            output.print();
        }
    }

    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass();
        AnonymousClass.Outer outer = anonymousClass.new Outer();
        outer.display();
    }
}
