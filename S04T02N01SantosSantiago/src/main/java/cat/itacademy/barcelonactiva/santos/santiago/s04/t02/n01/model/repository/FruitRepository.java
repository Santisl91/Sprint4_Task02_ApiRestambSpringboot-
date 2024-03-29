package cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.domain.Fruit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
