package liliya.prova.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Drinks extends ComposizioneMenu {

    private String name;

    public Drinks(String name, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + name + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
