package liliya.prova.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Autowired
    private Tavolo tavolo1;

    @Autowired
    private Pizzas pizzaMargherita;

    @Autowired
    private Pizzas hawaiianPizza;

    @Override
    public void run(String... args) throws Exception {
        try {
            menu.printMenu();

            Ordine o1 = new Ordine(3, tavolo1);
            o1.addComposizioneMenu(pizzaMargherita);
            o1.addComposizioneMenu(hawaiianPizza);

            System.out.println("DETTAGLI TAVOLO 1:");
            o1.stampaOrdine();

            System.out.println("CONTO TAVOLO 1");
            System.out.println(o1.Totale());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
