package liliya.prova.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Menu {
    private List<Pizzas> pizzas;
    private List<Toppings> toppings;
    private List<Drinks> drinks;

    public void printMenu() {
        System.out.println("---------------------Menù---------------------------");

        System.out.println("Pizzas: ");
        this.pizzas.forEach(System.out::println);
        System.out.println();

        System.out.println("Toppings: ");
        this.toppings.forEach(System.out::println);
        System.out.println();

        System.out.println("Drinks: ");
        this.drinks.forEach(System.out::println);
        System.out.println();

    }
}
