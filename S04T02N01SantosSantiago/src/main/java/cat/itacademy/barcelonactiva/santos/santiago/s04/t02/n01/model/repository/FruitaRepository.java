package cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;

public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
}
