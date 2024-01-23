package cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.repository.FruitRepository;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
    public Fruit getFruitById(int id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        return optionalFruit.orElse(null);
    }
}