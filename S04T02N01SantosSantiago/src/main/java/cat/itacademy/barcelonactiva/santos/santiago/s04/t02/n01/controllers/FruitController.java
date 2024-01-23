package cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.services.FruitService;

import java.util.List;

@RestController
@RequestMapping("/fruita")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public ResponseEntity<String> addFruita(@RequestBody Fruit fruita) {
        // Lógica para agregar una fruta
        // ...

        return ResponseEntity.ok("Fruita añadida con éxito");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFruita(@RequestBody Fruit fruita) {
        // Lógica para actualizar una fruta
        // ...

        return ResponseEntity.ok("Fruita actualizada con éxito");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruita(@PathVariable int id) {
        // Lógica para eliminar una fruta por ID
        // ...

        return ResponseEntity.ok("Fruita eliminada con éxito");
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOneFruita(@PathVariable int id) {
        Fruit fruit = fruitService.getFruitById(id);

        if (fruit != null) {
            return ResponseEntity.ok(fruit);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<  List<Fruit>> getAllFruits() {
        List<Fruit> fruits = fruitService.getAllFruits();
        return ResponseEntity.ok(fruits);
    }
}