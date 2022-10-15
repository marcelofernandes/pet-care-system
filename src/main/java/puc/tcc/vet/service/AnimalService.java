package puc.tcc.vet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import puc.tcc.vet.dto.AnimalDto;
import puc.tcc.vet.mapper.AnimalMapper;
import puc.tcc.vet.model.Animal;
import puc.tcc.vet.repository.AnimalRepository;

@Service
@AllArgsConstructor
public class AnimalService {

    @Autowired
    private final AnimalRepository repository;

    @Autowired
    private final AnimalMapper animalMapper;

    public List<Animal> readAll() {
        return (List<Animal>) this.repository.findAll();
    }

    public Animal create(AnimalDto dto) {
        return this.repository.save(this.animalMapper.toModel(dto));
    }

    public Animal update(AnimalDto dto) {
        final var model = this.animalMapper.toModel(dto);
        final Optional<Animal> aux = this.repository.findById(model.getId());
        if (aux.isPresent()) {
            return this.repository.save(aux.get());
        } else {
            throw new RuntimeException("Objet not found for this id :: " + model.getId());
        }
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }


}
