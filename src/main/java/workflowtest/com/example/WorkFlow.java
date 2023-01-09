package workflowtest.com.example;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface WorkFlow {

    @WorkflowMethod
    String start();
}
