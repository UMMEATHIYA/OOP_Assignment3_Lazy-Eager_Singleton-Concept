package OOP_Assignment3.Question1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EagerSingletonAssignment3 {
    private static final int MAX_INSTANCES = 3;
    private static int instanceCount = 0;
    private static EagerSingletonAssignment3[] instances = new EagerSingletonAssignment3[MAX_INSTANCES];

    static {
        for (int i = 0; i < MAX_INSTANCES; i++) {
            instances[i] = new EagerSingletonAssignment3();
        }
    }

    private EagerSingletonAssignment3() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Instance created at: " + formattedDate);
    }

    public static EagerSingletonAssignment3 getInstance() {
        if (instanceCount < MAX_INSTANCES) {
            return instances[instanceCount++];
        } else {
            System.out.println("Maximum number of instances reached.");
            return null;
        }
    }
}
