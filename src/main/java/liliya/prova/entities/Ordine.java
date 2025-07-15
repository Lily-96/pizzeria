package liliya.prova.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Ordine {
    private List<ComposizioneMenu> elementi;
    private int numeroOrdine;
    private StatoOrdine StatoO;
    private int numeroCoperti;
    private Tavolo tavolo;
    private LocalTime orario;
    private double costoCoperto;

    public double Totale() {
        double totale = numeroCoperti * costoCoperto;
        for (ComposizioneMenu item : elementi) {
            totale += item.getPrezzo();
        }
        return totale;
    }

    public void stampaOrdine() {
        System.out.println("------------ORDINE n'" + numeroOrdine + "--------------");

    }


}