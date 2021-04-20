package pl.mr.beans;

import org.springframework.stereotype.Component;
import pl.mr.beans.MessageProducer;

@Component
public class SimpleMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
        return "Przyklad "+ System.currentTimeMillis();
    }
}
