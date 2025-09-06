package service;

import model.Barbeiro;
import repository.BarbeiroRepository;
import java.util.List;
import java.util.Optional;

public class BarbeiroService {
    private BarbeiroRepository barbeiroRepository = new BarbeiroRepository();

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
