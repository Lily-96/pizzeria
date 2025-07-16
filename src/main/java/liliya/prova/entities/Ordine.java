package liliya.prova.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Ordine {
    private List<ComposizioneMenu> elementi;
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private Tavolo tavolo;
    private LocalTime orario;
    private double costoCoperto;

    public Ordine(int numeroCoperti, Tavolo tavolo) {
        Random random = new Random();
        if (tavolo.getMaxCoperti() <= numeroCoperti)
            throw new RuntimeException("Numero coperti non ammesso");
        this.numeroOrdine = random.nextInt(1, 1500);
        this.stato = StatoOrdine.IN_CORSO;
        this.numeroCoperti = numeroCoperti;
        this.orario = LocalTime.now();
        this.elementi = new ArrayList<>();
        this.tavolo = tavolo;
        this.costoCoperto = tavolo.getCostoCoperto();
    }

    public void addComposizioneMenu(ComposizioneMenu composizioneMenu){
        this.elementi.add(composizioneMenu);
    }

    public double Totale() {

        return this.elementi.stream().mapToDouble(ComposizioneMenu::getPrezzo).sum() + (this.tavolo.getCostoCoperto()* this.numeroCoperti);
    }

    public void stampaOrdine() {
        System.out.println("------------ORDINE n'" + numeroOrdine + "--------------");
        System.out.println("Coperti:" + numeroCoperti);
        System.out.println( "Tavolo: "+ tavolo);
        System.out.println("Stato: " + stato);
        System.out.println("Ora: " + orario);
        System.out.println("Elementi: " + elementi);
        System.out.println("Coperto: " + costoCoperto);
        this.elementi.forEach(System.out::println);
        System.out.println("totale--> " + this.Totale());

    }

}