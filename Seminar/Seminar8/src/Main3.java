import java.util.LinkedList;
import java.util.List;

public class Main3 {

    private static int NR_THREADS = 50;
    public static void main(String[] args) {
        List<Thread> singletonThreads = new LinkedList<>();

        for(int i = 0; i < NR_THREADS; i++) {
            Thread singleton = new Thread(()-> System.out.println(Singleton.getInstance()));
            singletonThreads.add((singleton));
        }

        for(int i = 0; i < NR_THREADS; i++) {
            singletonThreads.get(i).start();
        }


    }
}
