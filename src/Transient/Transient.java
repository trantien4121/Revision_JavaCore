package Transient;

import java.io.*;

public class Transient implements Serializable {    //Serialization cho phep chuyen doi doi tuong thanh dong byte sau do tai tao lai di tuong tu dong byte do
    public int x = 3;
    transient long y = 4;
    private short z = 5;    //duoc su dung de luu cac so nguyen 16 bit

    int getX(){
        return x;
    }
    long getY(){
        return y;
    }
    short getZ(){
        return z;
    }

    public static void main(String[] args) {
        //Tao Object Transient t
        Transient t = new Transient();
        System.out.println(t.getX() + t.getY() + t.getZ());

        try{
            //Tao Object ObjectOutputString
            FileOutputStream fos = new FileOutputStream("dg.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Ghi t vao file
            oos.writeObject(t);
            oos.close();

            //Tao Object ObjectInputStream
            FileInputStream fis = new FileInputStream("dg.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //Doc Object transient t duoc luu o file dg.txt
            t = (Transient) ois.readObject();

            ois.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(t.getX() + t.getY() + t.getZ());

    }
}
