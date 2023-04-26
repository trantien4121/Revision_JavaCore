package NestedClass;

public class LocalClass {
    void display(){
        class Local{
            void print(){
                System.out.println("This is a local class");
            }
        }
        Local local = new Local();
        local.print();
    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();
        localClass.display();
    }
}
