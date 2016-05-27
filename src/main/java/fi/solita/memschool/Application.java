package fi.solita.memschool;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * Created by juhofr on 25/05/16.
 */
public class Application {

    public static void main(String[] args) {
        System.out.println("Filling List with UUID 'till eternity...");
        LinkedList<UUID> foos = new LinkedList<>();
        while(true) {
            foos.add(UUID.randomUUID());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
