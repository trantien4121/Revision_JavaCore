package OOP;

public class TestStatic {
    static int count = 0;
    private String name;
    public TestStatic(String name){
        this.name = name;
        count ++;
    }

    public static void main(String[] args) {
        System.out.println(TestStatic.count);
        TestStatic te = new TestStatic("Tien");
        System.out.println(TestStatic.count);
    }
}
