package controller;

import model.Barbeiro;
import java.util.List;

public class BarbeiroController {
    private final BarbeiroService barbeiroService;

    public BarbeiroController(BarbeiroService barbeiroService) {
        this.barbeiroService = barbeiroService;
    }

    public void adicionarBarbeiro(Barbeiro barbeiro) {
        barbeiroService.cadastrarBarbeiro(barbeiro);
    }

    public void removerBarbeiro(Barbeiro barbeiro) {
        barbeiroService.removerBarbeiro(barbeiro);
    }

    public List<Barbeiro> listarBarbeiros() {
        return barbeiroService.listarBarbeiros();
    }
}
