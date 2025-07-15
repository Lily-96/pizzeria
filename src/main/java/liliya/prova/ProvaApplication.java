package liliya.prova;

import liliya.prova.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProvaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvaApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProvaApplication.class);

        Menu m = (Menu) context.getBean("menu");

        m.printMenu();
        context.close();
    }
}
