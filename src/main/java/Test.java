import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list=new ArrayList();
        AdderThread adderThread=new AdderThread(list);
        RemoverThread removerThread=new RemoverThread(list);
        Thread adder=new Thread(adderThread);
        Thread remover=new Thread(removerThread);
        adder.start();
        remover.start();
    }
}
