package liliya.prova.entities;


import lombok.Getter;

import java.util.List;


@Getter
public class Pizzas extends ComposizioneMenu {
    private String name;

    private List<Toppings> listaTopping;

    public Pizzas(String name, List<Toppings> listaTopping) {
        super(1050, 5.00);
        this.name = name;
        this.listaTopping = listaTopping;
        this.calorie = setCalorie(listaTopping);
        this.prezzo = setPrezzo(listaTopping);

    }


    private double setPrezzo(List<Toppings> t) {
        double tot = 5.00;
        if (t != null) {
            for (int i = 0; i < t.size(); i++) {
                tot += t.get(i).getPrezzo();
            }
        } else return tot;
        return tot;
    }

    private int setCalorie(List<Toppings> listaTopping) {
        int base = 1050;
        if (listaTopping != null) {
            for (int i = 0; i < listaTopping.size(); i++) {
                base += listaTopping.get(i).getCalorie();
            }
        } else return base;
        return base;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", name='" + name + '\'' +
                ", listaTopping=" + listaTopping +
                ", name='" + name + '\'' +
                '}';
    }
}

