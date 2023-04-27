package Thread;

public class Loader1 extends Thread{
    private int i = 0;
    Loader1(int j){
        this.i = j;
    }
    public void run(){
        for(int j=1; j< i; j++){
            System.out.println("Hello" + i + "/" + j);
        }
    }

    public static void main(String[] args) {
        Loader1 l1 = new Loader1(5);
        Loader1 l2 = new Loader1(20);
        Loader1 l3 = new Loader1(10);

        l1.start();
        l2.start();
        l3.start();
    }
}
