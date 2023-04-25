package test1;

public class Compare {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("Hello");

        String c = a;
        System.out.println(a==b);   //-> false  (Tro den 2 o nho khac nhau)
        System.out.println(a==c);   //-> true   (Cung tro den 1 o nho)
        System.out.println(a.equals(b)); //->true   (Co gia trị bang nhau)
        System.out.println(a.equals(c)); //->true   (Co gia tri bang nhau)
    }
}
