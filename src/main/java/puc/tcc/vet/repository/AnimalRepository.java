package puc.tcc.vet.repository;

import org.springframework.data.repository.CrudRepository;
import puc.tcc.vet.model.Animal;
import puc.tcc.vet.model.Cliente;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
