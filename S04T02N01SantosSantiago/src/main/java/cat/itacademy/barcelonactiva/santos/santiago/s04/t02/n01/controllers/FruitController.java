package cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.services.FruitService;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public ResponseEntity<String> addFruit(@RequestBody Fruit fruit) {

        return ResponseEntity.ok("Fruit added successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFruit(@RequestBody Fruit fruit) {

        return ResponseEntity.ok("Fruit updated successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruit(@PathVariable int id) {

        return ResponseEntity.ok("Fruit deleted successfully");
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable int id) {
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

    public FruitService getFruitService() {
        return fruitService;
    }

    public void setFruitService(FruitService fruitService) {
        this.fruitService = fruitService;
    }
}