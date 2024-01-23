package cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.services.FruitaService;

@RestController
@RequestMapping("/fruita")
public class FruitaController {

    @Autowired
    private FruitaService fruitaService;

    @PostMapping("/add")
    public ResponseEntity<String> addFruita(@RequestBody Fruita fruita) {
        // Lógica para agregar una fruta
        // ...

        return ResponseEntity.ok("Fruita añadida con éxito");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFruita(@RequestBody Fruita fruita) {
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
    public ResponseEntity<Fruita> getOneFruita(@PathVariable int id) {
        // Lógica para obtener una fruta por ID
        // ...

        return ResponseEntity.ok(/* Fruita obtenida */);
    }

    @GetMapping("/getAll")
    public ResponseEntity<  List<Fruita>> getAllFruites() {
        List<Fruita> fruites = fruitaService.getAllFruites();
        return ResponseEntity.ok(fruites);
    }
}