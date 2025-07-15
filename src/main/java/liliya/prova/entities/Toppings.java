package liliya.prova.entities;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Toppings extends ComposizioneMenu {
    private String name;

    public Toppings(String name, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }
}
