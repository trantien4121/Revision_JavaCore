package Collection;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        //Arraylist
        ArrayList<String> str = new ArrayList<String>();
        str.add("a");
        str.add("b");
        str.add("c");
        System.out.println("---ArrayList---");
        System.out.println(str);
        Collections.sort(str);  //Sort str
        str.forEach(s -> {      //Using Lambda Expressions
            System.out.println(s);
        });
        System.out.println(str.get(0)); //
        str.set(2, "d");
        str.remove(1);
        System.out.println(str);


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

        //add First, Last, remove First, Last, get First, Last
        strLkl.addFirst("lk0");
        strLkl.addLast("lk4");
        System.out.println(strLkl);
        System.out.println(strLkl.getFirst());
        System.out.println(strLkl.getLast());

        strLkl.removeFirst();
        strLkl.removeLast();
        System.out.println(strLkl);

        //Priority Queue
        System.out.println("---Priority Queue---");
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("pq1");
        pq.add("pq2");
        pq.add("pq3");
        System.out.println(pq);

        System.out.println("peek: " + pq.peek());   //peek the top element of the queue
        pq.poll();  //remove top element of the queue
        System.out.println("after poll: " + pq);

        System.out.println("Contains pq1?: " + pq.contains("pq1"));
        pq.clear(); //remove all element of the queue
        System.out.println("after clear: " + pq);

        //Array Dequeue
        System.out.println("---Array Deque---");
        ArrayDeque<String> ad = new ArrayDeque<String>();
        ad.add("ad2");  //If Array Deque full, add() will throw an exception
        ad.addFirst("ad1");
        ad.addLast("ad3");

        System.out.println(ad);
        ad.offer("ad4-of"); //insert element that is pointed in the last of Array Deque. If Array Dequeue full, offer() return false
        ad.offerFirst("ad0-of");    //insert element that is pointed in the first of Array Deque
        ad.offerLast("ad5-of");   //insert element that is pointed in the last of Array Deque
        System.out.println("after: " + ad);
        System.out.println("The First element of Array Deque: " + ad.getFirst());
        System.out.println("The Last element of the Array Deque: " + ad.getLast()); //If Array Dequeue empty, getFirst(), getLast() throw a no such element


        System.out.println("peek: " + ad.peek());   //get the first element of the AD
        System.out.println("peek first: " + ad.getFirst()); //get the first element of the AD
        System.out.println("peek last: " + ad.getLast());   //get the last element the AD, //If Array Dequeue empty, getFirst(), getLast() throw a no such element

        ad.poll();  //can use remove()
        System.out.println("after poll: " + ad);    //remove first
        ad.pollFirst(); //can use removeFirst()
        System.out.println("after poll first: " + ad);
        ad.pollLast();  //call use removeLast()
        System.out.println("after poll last: " + ad);

        Iterator<String> desIterate = ad.descendingIterator(); //Using descendingIterator()
        while(desIterate.hasNext()){
            System.out.println(desIterate.next());
        }

        ad.clear();
        System.out.println("after clear: " + ad);

        //HashSet
        System.out.println("---HashSet---");
        HashSet<String> hs = new HashSet<String>(); //A HashSet is a collection of items where every item is unique
        hs.add("hs1");
        hs.add("hs2");
        hs.add("hs3");
        hs.add("hs3");
        System.out.println(hs);

        for(String h :hs){
            System.out.println(h);
        }

        System.out.println("HS contains hs3?: " + hs.contains("hs3"));
        hs.remove("hs2");
        System.out.println("after remove: " + hs);
        hs.clear();
        System.out.println("after clear: " + hs);

        //LinkedHashSet
        System.out.println("---LinkedHashSet---");
        LinkedHashSet<String> lkhs = new LinkedHashSet<String>();
        lkhs.add("lkh1");
        lkhs.add("lkh2");
        lkhs.add("lkh3");
        lkhs.add("lkh3");
        System.out.println(lkhs);

        LinkedHashSet<String> lkhsA = new LinkedHashSet<String>();
        lkhsA.add("lkh1");
        lkhs.add("lkh1");

        //them nhung phan tu cua lkhsA vao lkhs
        lkhs.addAll(lkhsA);
        System.out.println("After addAll() from lkhsA: " + lkhs);
        // xóa những phần tử không thuộc lkhsA khỏi lkhs, thuong duoc goi la lay giao diem
        lkhs.retainAll(lkhsA);
        System.out.println("After retainAll() from lkshA: " + lkhs);

        //TreeSet
        System.out.println("---TreeSet---");
        TreeSet<String> ts = new TreeSet<String>(); //every items unique, maintain ascending order(tang dan),
        ts.add("a");
        ts.add("c");
        ts.add("a");
        ts.add("e");
        ts.add("d");
        ts.add("b");

        System.out.println(ts);

        System.out.println("first element: " + ts.first());
        System.out.println("last element: " + ts.last());
        System.out.println("Using higher: " + ts.higher("c"));  //Tra ve phan tu lon hon c nho nhat
        System.out.println("Using lower: " + ts.lower("c"));    //Tra ve phan tu nho hon c lon nhat
        System.out.println("Using ceiling: " + ts.ceiling("c"));    //Tra ve phan tu >=c nho nhat

        //pollFirst, pollLast, removeFirst, removeLast De Xoa

        System.out.println("Using headset without boolean value: " + ts.headSet("c"));  //Tra ve cac phan tu truoc phan tu chi dinh ma khong lay phan tu chi dinh do (mac dinh la false)
        System.out.println("Using headset with boolean value: " + ts.headSet("c", true));   //Tra ve cac phan tu truoc phan tu chi dinh va lay luon phan tu chi dinh do

        System.out.println("Using tailSet without boolean value: " + ts.tailSet("c", false));   //Tra ve cac phan tu sau phan tu chi dinh va lay luon phan tu do (mac dinh true)
        System.out.println("Using tailSet with boolean value: " + ts.tailSet("c"));   //Tra ve cac phan tu sau phan tu chi dinh va ko lay phan tu do ( mac dinh la true)

        //co cac phuong thuc dang trung cua set nhu addAll() de lien ket, retainAll() lay giao 2 tap, removeAll() tinh toan su khac biet giua 2 tap

        TreeSet<String> ts2 = new TreeSet<String>();
        ts2.add("c");
        ts2.add("d");
        System.out.println("ts2: " + ts2);
        System.out.println("ts2 subset of ts?: " + ts.containsAll(ts2));    //check ts2 is subset of the ts

        //HashMap
        System.out.println("---HashMap---");
        HashMap<Integer, String> user = new HashMap<Integer, String>(); //A HashMap     store items in "key/value" pairs, and you can access them by an index of another type
        user.put(1, "personA");
        user.put(2, "personB");
        user.put(3, "personC");
        user.put(4, "personD");

        System.out.println(user);
        System.out.println(user.get(1));    //get Value by key

        user.remove(4); //remove By Key
        System.out.println("After remove: " + user);

        for(int i : user.keySet()){
            System.out.println(i);
        }
        for(String name : user.values()){
            System.out.println(name);
        }

        for(int i : user.keySet()){
            System.out.println("key: " + i + " value: " + user.get(i));
        }

        user.clear();
        System.out.println("after clear: " + user);

        //LinkedHashMap (Khac voi HashMap la du lieu co duy tri theo thu tu)
        System.out.println("---LinkedHashMap---");
        LinkedHashMap<Integer, String> userLHM = new LinkedHashMap<Integer, String>();

        userLHM.put(0, null);
        userLHM.put(1, "userA");
        userLHM.put(2, "userB");
        userLHM.put(3, "userC");
        userLHM.put(4, "userD");

        System.out.println(userLHM);

        LinkedHashMap<Integer, String> userLMH2 = new LinkedHashMap<Integer, String>();
        userLMH2.put(5, "userE");

        userLMH2.putAll(userLHM);   //Copy tat ca gai tri cua userLHM sang LHM2
        System.out.println(userLMH2);

        userLMH2.replace(5, "userE_Replace");
        System.out.println("after replace: " + userLMH2);

        for(int i : userLMH2.keySet()){
            System.out.println("key: " + i + " value: " + userLMH2.get(i));
        }
        System.out.println(userLMH2.keySet());  //Tra ve 1 set Interface chua tat ca cac key cua LinkedHashMap
        System.out.println(userLMH2.values());  //Tra ve 1 Collection chua tat ca cac value cua LinkedHashMap

        //HashTable
        System.out.println("---HashTable---");
        Hashtable<Integer, String> userHt = new Hashtable<Integer, String>();
        userHt.put(1, "people1");
        userHt.put(2, "people2");
        userHt.put(3, "people3");
//        userHt.put(null, "people4");    // Nem ra exception vi HashTable ko chua bat ki gia ky hoac value nao la null
        System.out.println(userHt);
        userHt.remove(4);
        System.out.println("after remove: " + userHt);

        Enumeration<Integer> keys = userHt.keys();  //HashTable duoc duyet boi Enumerator va Iterator
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + userHt.get(key));
        }

        Hashtable<Integer, String> ht1 = new Hashtable<>(4);

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>(3);

        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        //Khi kích thước của Hashtable vượt quá 3/4 dung lượng ban đầu(he so tai mac dinh ban dau la 0.75), dung lượng của Hashtable sẽ tăng gấp đôi.
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
        ht2.put(7, "seven");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

        //TreeMap
        System.out.println("---TreeMap---");    //TreeMap khong the chua bat ki key hoac value nao la null, TreeMap duy tri cac phan tu theo thu tu cay tang dan
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(1, "element1");
        tm.put(4, "element4");
        tm.put(3, "element3");
        tm.put(2, "element2");
        System.out.println(tm); //Co thu tu

        for(int i: tm.keySet()){
            System.out.println("key: " + i + " value " + tm.get(i));
        }

        System.out.println("TreeMap contains key 3?: " + tm.containsKey(3));

        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();
        tm2.put(7, "element7");
        tm2.put(5, "element5");
        tm2.put(4, "element4_ud");

        tm.putAll(tm2);
        System.out.println("after putAll: " + tm);
    }
}
