package liliya.prova.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Tavolo {
    private int numeroTavolo;
    private int maxCoperti;
    private StatoTavolo stato;
}
