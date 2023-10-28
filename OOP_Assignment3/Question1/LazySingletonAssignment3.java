package OOP_Assignment3.Question1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LazySingletonAssignment3 {
    private static final int MAX_INSTANCES = 3;
    private static int instanceCount = 0;
    private static LazySingletonAssignment3[] instances = new LazySingletonAssignment3[MAX_INSTANCES];

    private LazySingletonAssignment3() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Instance created at: " + formattedDate);
    }

    public static LazySingletonAssignment3 getInstance() {
        if (instanceCount < MAX_INSTANCES) {
            instances[instanceCount] = new LazySingletonAssignment3();
            return instances[instanceCount++];
        } else {
            System.out.println("Maximum number of instances reached.");
            return null;
        }
    }
}
