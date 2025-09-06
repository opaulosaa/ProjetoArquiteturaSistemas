package controller;

import model.Barbeiro;
import java.util.ArrayList;
import java.util.List;

public class BarbeiroController {
    private List<Barbeiro> barbeiros = new ArrayList<>();

    public void adicionarBarbeiro(Barbeiro barbeiro) {
        barbeiros.add(barbeiro);
    }

    public void removerBarbeiro(Barbeiro barbeiro) {
        barbeiros.remove(barbeiro);
    }

    public List<Barbeiro> listarBarbeiros() {
        return new ArrayList<>(barbeiros);
    }
}
