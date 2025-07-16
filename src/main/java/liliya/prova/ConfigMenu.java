package liliya.prova;

import liliya.prova.entities.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Configuration
public class ConfigMenu {
    @Bean(name = "toppings_tomato")
    public Toppings toppingTomatoBean() {
        return new Toppings("Tomato", 0, 0);
    }

    @Bean(name = "toppings_cheese")
    public Toppings toppingCheeseBean() {
        return new Toppings("Cheese", 92, 0.69);
    }

    @Bean(name = "toppings_ham")
    public Toppings toppingHamBean() {
        return new Toppings("Ham", 35, 0.99);
    }

    @Bean(name = "toppings_pineapple")
    public Toppings toppingPineappleBean() {
        return new Toppings("Pineapple", 24, 0.79);
    }

    @Bean(name = "toppings_salami")
    public Toppings toppingSalamiBean() {
        return new Toppings("Salami", 86, 0.99);
    }

    @Bean(name = "pizza_margherita")
    @Primary
    public Pizzas pizzaMargheritaBean() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizzas("Pizza Margherita", tList);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizzas pizzaHawaiianBean() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizzas("Hawaiian Pizza", tList);
    }

    @Bean(name = "lemonade")
    public Drinks lemonadeBean() {
        return new Drinks("Lemonade", 128, 1.29);
    }

    @Bean(name = "water")
    public Drinks waterBean() {
        return new Drinks("Water", 0, 1.29);
    }

    @Bean(name = "wine")
    public Drinks wineBean() {
        return new Drinks("Wine", 607, 7.49);
    }

    @Bean(name = "menu")
    public Menu menuBean() {
        List<Pizzas> pizzas = new ArrayList<>();



        pizzas.add(pizzaMargheritaBean());
        pizzas.add(pizzaHawaiianBean());

        List<Drinks> drinks = new ArrayList<>();
        drinks.add(lemonadeBean());
        drinks.add(waterBean());
        drinks.add(wineBean());

        List<Toppings> toppings = new ArrayList<>();
        toppings.add(toppingTomatoBean());
        toppings.add(toppingCheeseBean());
        toppings.add(toppingSalamiBean());
        toppings.add(toppingHamBean());
        toppings.add(toppingPineappleBean());

        return new Menu(pizzas, toppings, drinks);
    }


    @Bean("Tavolo1")
     Tavolo getTavolo1(@Value("${coperto}") double coperto) {
        System.out.println("Valore di coperto: " + coperto);
        return new Tavolo(1, 5, StatoTavolo.LIBERO,coperto);
    }
}
