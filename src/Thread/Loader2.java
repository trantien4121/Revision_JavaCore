package Thread;

public class Loader2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello 1");
        System.out.println("waiting for 5 seconds ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {  //La ngoai le duoc sinh ra khi 1 luong bi gian doan boi phuong thuc interrupt() cua 1 luong khac
            e.printStackTrace();
        }
        System.out.println("Hello 2");
        System.out.println("waiting for 2 seconds ...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finished");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Loader2());
        t.start();
    }
}
