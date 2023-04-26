package NestedClass;

public class StaticNestedClass {
    static class Inner{
        void display(){
            System.out.println("Ten la Tien");
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.Inner staticNestedClass = new StaticNestedClass.Inner();
        staticNestedClass.display();
    }
}
