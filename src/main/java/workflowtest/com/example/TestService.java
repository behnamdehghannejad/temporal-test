package workflowtest.com.example;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import io.temporal.common.RetryOptions;
import io.temporal.worker.WorkflowImplementationOptions;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
@AllArgsConstructor
public class TestService {

    private final WorkflowClient workflowClient;

    private WorkFlow createWorkFlowConnection(String workFlowId) {
        RetryOptions retryoptions = RetryOptions.newBuilder()
                .setMaximumAttempts(1)
                .build();

        WorkflowOptions options = WorkflowOptions.newBuilder()
                .setWorkflowRunTimeout(Duration.ofHours(12))
                .setTaskQueue("1111111111111")
                .setRetryOptions(retryoptions)
                .setWorkflowId(workFlowId)
                .build();

        return workflowClient.newWorkflowStub(WorkFlow.class, options);
    }
    public String start() {
        WorkFlow workFlowConnection = createWorkFlowConnection("1111111111111222222222222222");
        return workFlowConnection.start();
    }
}
