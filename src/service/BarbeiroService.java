package service;

import model.Barbeiro;
import java.util.*;

public class BarbeiroService {
    private final Repository<Barbeiro> barbeiroRepository;

    public BarbeiroService(Repository<Barbeiro> barbeiroRepository) {
        this.barbeiroRepository = barbeiroRepository;
    }

    public void cadastrarBarbeiro(Barbeiro barbeiro) {
        barbeiroRepository.save(barbeiro);
    }

    public void removerBarbeiro(Barbeiro barbeiro) {
        barbeiroRepository.delete(barbeiro);
    }

    public List<Barbeiro> listarBarbeiros() {
        return barbeiroRepository.findAll();
    }

    public Optional<Barbeiro> buscarPorId(int id) {
        return barbeiroRepository.findById(id);
    }
}
