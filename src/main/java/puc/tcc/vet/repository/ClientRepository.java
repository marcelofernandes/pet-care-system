package puc.tcc.vet.repository;

import org.springframework.data.repository.CrudRepository;
import puc.tcc.vet.model.Cliente;

public interface ClientRepository extends CrudRepository<Cliente, Long> {
}
