package pl.mr.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {


    private MessageProducer messageProducer;

    public MessagePrinter(){}

    @Autowired
    public MessagePrinter(MessageProducer messageProducer){
        this.messageProducer=messageProducer;
    }



    public void printMessage(){
        String message=messageProducer.getMessage();
        System.out.println(message);
    }

    public MessageProducer getMessageProducer() {
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }
}
