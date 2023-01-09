package workflowtest.com.example;

import org.springframework.stereotype.Component;

@Component
public class ActivityImpl implements Activity {
    @Override
    public String start() {
        double random = Math.random();
        System.out.println("============== random =====> " + random);
        if (random * 10 < 2) {
//            return String.valueOf(io.temporal.activity.Activity.getExecutionContext().getInfo().getAttempt());
            if (random * 10 < 2) {
                throw new NullPointerException("NUllPOINTER");
            }
            throw new NullPointerException("CLASSCAST");
        }
        throw new RuntimeException("FAILED");
    }

    public String end() {
        double random = Math.random();
        System.out.println("============== random =====> " + random);
//        if (random * 10 < 2) {
//            throw new RuntimeException("FAILED");
//        }
//        throw new RuntimeException("FAILED");

        return "YES";
    }
}
