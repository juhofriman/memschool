package fi.solita.memschool;

/**
 * Created by juhofr on 25/05/16.
 */
public class Application {

    public static void main(String[] args) {
        System.out.println("Filling StringBuffer 'till eternity...");
        StringBuffer stringBuffer = new StringBuffer();
        while(true) {
            try {
                Thread.sleep(10);
                stringBuffer.append("foo");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
