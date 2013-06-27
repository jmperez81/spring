package rewards.jms.client;

import java.util.List;

import org.springframework.jms.core.JmsTemplate;

import rewards.Dining;

/**
 * A batch processor that sends dining event notifications via JMS.
 */
public class JmsDiningBatchProcessor implements DiningBatchProcessor {

	// TODO 03: provide a JmsTemplate field
	private JmsTemplate jmsTemplate;

	public JmsDiningBatchProcessor(JmsTemplate jmsTemplate) {
		super();
		this.jmsTemplate = jmsTemplate;
	}



	public void processBatch(List<Dining> batch) {
		for (Dining dining : batch) {
			jmsTemplate.convertAndSend("diningQueue", dining);
		}
	}
}
