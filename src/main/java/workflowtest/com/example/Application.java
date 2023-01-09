package workflowtest.com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		runWorkflowWorker(context);
	}

	private static void runWorkflowWorker(ConfigurableApplicationContext context) {
//		MainWorker worker = context.getBean(MainWorker.class);
//		worker.startWorker();
	}
}
