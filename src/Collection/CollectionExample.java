package Collection;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        //Arraylist
        List<String> str = new ArrayList<String>();
        str.add("a");
        str.add("b");
        str.add("c");
        System.out.println("---ArrayList---");
        System.out.println(str);
        str.forEach(s -> {      //Using Lambda Expressions
            System.out.println(s);
        });

        //Vector
        Vector<String> strVe1 = new Vector<String>(4);
        strVe1.add("v1");
        strVe1.add("v2");

        System.out.println("---Vector---");
        System.out.println(strVe1);
        System.out.println("Kich thuoc cua vector la: " + strVe1.size());
        System.out.println("Capacity mac dinh cua vector la: " + strVe1.capacity());

        strVe1.addElement("v3");
        strVe1.addElement("v4");
        System.out.println("Vecto sau khi them la " + strVe1);
        System.out.println("Kich thuoc cua vector sau khi them la: " + strVe1.size());

        if(strVe1.contains("v3")){
            System.out.println("v3 co trong vector, tai vi tri: " + strVe1.indexOf("v3"));
        }else{
            System.out.println("v3 khong co trong vector");
        }

        System.out.println("Phan tu dau tien trong vector la: " + strVe1.firstElement());
        System.out.println("Phan tu cuoi cung trong vector la: " + strVe1.lastElement());

        //LinkedList
        LinkedList<String> strLkl = new LinkedList<String>();
        strLkl.add("lk1");
        strLkl.add("lk2");
        strLkl.add("lk3");

        System.out.println("---LinkedList---");
        System.out.println("LinkedList 1 la: " + strLkl);

        Iterator<String> itr = strLkl.iterator();   //Duyet theo iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("addAll()");
        System.out.println("---");
        // thêm các phần tử của list vào listA
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(strLkl);
        System.out.println("listA: " + listA);

        System.out.println("retainAll()");
        System.out.println("---");
        // khởi tạo listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("lk2");
        listB.add("lk3");
        // xóa những phần tử không thuộc listB khỏi listA
        listA.retainAll(listB);
        System.out.println("listA: " + listA);

        System.out.println("removeAll()");
        System.out.println("---");
        // xóa những phần tử thuộc listB  khỏi strLkl
        strLkl.removeAll(listB);
        System.out.println("strLkl: " + strLkl);
    }
}
