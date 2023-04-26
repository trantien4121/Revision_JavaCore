package TypeCasting;

public class ExplicitCasting {
    public static void main(String[] args) {
        double p = 3.14592654;
        int pInt = (int) p;
        System.out.println(pInt);

        String str = Double.toString(p);
        String str2 = Float.toString(pInt);

        System.out.println("Sau khi ep kieu sang string: " + str +  ", " + str2);

        double value = Double.parseDouble(str);
        float valueFloat = Float.parseFloat(str2);

        System.out.println("sau khi ep kieu sang int va float: " +  value + " ," + valueFloat);
    }
}
