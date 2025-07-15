package liliya.prova.entities;


import lombok.Getter;


@Getter


public abstract class ComposizioneMenu {
    // protected String name;
    protected int calorie;
    protected double prezzo;

    public ComposizioneMenu(int calorie, double prezzo) {
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
}


