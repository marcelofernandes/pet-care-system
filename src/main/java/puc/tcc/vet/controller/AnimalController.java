package puc.tcc.vet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.tcc.vet.dto.AnimalDto;
import puc.tcc.vet.model.Animal;
import puc.tcc.vet.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService service;

    @PostMapping
    public ResponseEntity<Animal> createNote(@RequestBody AnimalDto dto) {
        var result = service.create(dto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping
    public List<Animal> readAll() {
        return service.readAll();
    }

    @PutMapping("/{id}")
    public Animal update(@RequestBody AnimalDto dto) {
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }

}
