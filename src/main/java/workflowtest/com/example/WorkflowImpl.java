package workflowtest.com.example;

import io.temporal.activity.ActivityOptions;
import io.temporal.common.RetryOptions;
import io.temporal.workflow.Workflow;

import java.time.Duration;

public class WorkflowImpl implements WorkFlow{

    private final ActivityOptions activityOptions = ActivityOptions.newBuilder()
            .setTaskQueue(this.getClass().getName())
            .setStartToCloseTimeout(Duration.ofMinutes(2))
            .setHeartbeatTimeout(Duration.ofSeconds(2))
            .build();

    private final Activity activity = Workflow.newActivityStub(Activity.class, activityOptions);

    @Override
    public String start() {
        System.out.println("============== startWorkflow =====> ");
        String start;
        try {
            start = activity.start();
        } catch (RuntimeException e) {
            return "Exception Catch";
        }
//        String end = activity.end();
        return start;
    }
}
