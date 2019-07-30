import java.util.List;

public class RemoverThread implements Runnable{
    volatile List list;

    public RemoverThread(List list) {
        this.list = list;
    }

    public void run() {
        while (true){
            if(!list.isEmpty()){
                System.out.println(list.get(0));
                list.remove(0);
                System.out.println(list.size());
            }
        }
    }
}
