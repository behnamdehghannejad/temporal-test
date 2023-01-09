package workflowtest.com.example;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface Activity {

    @ActivityMethod
    String start();

    @ActivityMethod
    String end();
}
