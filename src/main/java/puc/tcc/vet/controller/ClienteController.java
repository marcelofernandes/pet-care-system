package puc.tcc.vet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.tcc.vet.dto.ClienteDto;
import puc.tcc.vet.model.Cliente;
import puc.tcc.vet.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<Cliente> createNote(@RequestBody ClienteDto dto) {
        var result = service.create(dto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping
    public List<Cliente> readAll() {
        return service.readAll();
    }

    @PutMapping("/{id}")
    public Cliente update(@RequestBody ClienteDto dto) {
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }

}
