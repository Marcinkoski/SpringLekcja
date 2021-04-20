package pl.mr.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.mr.beans.MessagePrinter;

@Configuration
@ComponentScan(basePackages = "pl.mr")
public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringDiApplication.class);
        MessagePrinter printer=ctx.getBean(MessagePrinter.class);
        printer.printMessage();
        ctx.close();
    }
}
