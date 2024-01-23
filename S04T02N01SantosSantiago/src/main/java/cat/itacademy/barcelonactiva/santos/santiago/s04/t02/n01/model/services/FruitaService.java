package cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository.FruitaRepository;

@Service
public class FruitaService {

    @Autowired
    private FruitaRepository fruitaRepository;

    // Métodos para gestionar operaciones CRUD
    // ...

    public List<Fruita> getAllFruites() {
        return fruitaRepository.findAll();
    }

    // Otros métodos según sea necesario
}