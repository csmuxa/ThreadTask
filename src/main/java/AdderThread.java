import java.util.List;

public class AdderThread implements Runnable {
    volatile List list;

    public AdderThread(List list) {
        this.list = list;
    }

    public void run() {
        while (true){
            if (list.size()>99){
                System.out.println("Warning message");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                double number=Math.random();
                list.add(number);
                System.out.println(list.size());

            }
        }

    }
}
