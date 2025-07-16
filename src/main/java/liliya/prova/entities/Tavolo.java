package liliya.prova.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter

@AllArgsConstructor

public class Tavolo {
    private int numeroTavolo;
    private int maxCoperti;
    private StatoTavolo stato;
    private double costoCoperto;
}
