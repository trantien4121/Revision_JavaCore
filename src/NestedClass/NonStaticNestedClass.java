package NestedClass;

public class NonStaticNestedClass {
    private String name = "Tien";

    class Inner {
        void display() {
            System.out.println("Ten la: " + name);
        }
    }

    public static void main(String[] args) {
        NonStaticNestedClass nonStaticNestedClass = new NonStaticNestedClass();
        NonStaticNestedClass.Inner inner = nonStaticNestedClass.new Inner();
        inner.display();
    }
}

