package OOP_Assignment3.Question1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LazySingletonAssignment3 {
    // the variables are defined as private static because they prove a good example of encapsulation and these variables can be accessed within the class and static variables can be accessed with the help of class name.
    private static final int MAXIMUM_INSTANCES = 3;
    private static int inst_count = 0;
    // this statement basically instantiates the number of instances to be created, also it holds an array of elements.
    // In this case there are 3 instances as suggested in the question.
    // this creates the instance in global access method.
    private static LazySingletonAssignment3[] instances = new LazySingletonAssignment3[MAXIMUM_INSTANCES];

    private LazySingletonAssignment3() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Instance created at: " + formattedDate);
    }

    public static LazySingletonAssignment3 getInstance() {
        if (inst_count < MAXIMUM_INSTANCES) {
            // unlike the Eager Singleton, here the instances are created only when there is a requirement.
            // so there is a delay in creating the objects or instances.
            // we notice the seconds and milliseconds difference.
            instances[inst_count] = new LazySingletonAssignment3();
            return instances[inst_count++];
        } else {
            System.out.println("Maximum number of instances reached.");
            return null;
        }
    }
}
