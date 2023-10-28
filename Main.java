import OOP_Assignment3.Question1.EagerSingletonAssignment3;
import OOP_Assignment3.Question1.LazySingletonAssignment3;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Lazy Singleton
        System.out.println("Creating three instances of Lazy Singleton...");
        LazySingletonAssignment3.getInstance();
        Thread.sleep(2000);
        LazySingletonAssignment3.getInstance();
        Thread.sleep(2000);
        LazySingletonAssignment3.getInstance();
        System.out.println();

        // Eager Singleton
        System.out.println("Creating three instances of Eager Singleton...");
        EagerSingletonAssignment3.getInstance();
        Thread.sleep(2000);
        EagerSingletonAssignment3.getInstance();
        Thread.sleep(2000);
        EagerSingletonAssignment3.getInstance();
    }

}