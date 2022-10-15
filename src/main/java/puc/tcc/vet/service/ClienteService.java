package puc.tcc.vet.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import puc.tcc.vet.dto.AnimalDto;
import puc.tcc.vet.dto.ClienteDto;
import puc.tcc.vet.mapper.AnimalMapper;
import puc.tcc.vet.mapper.ClienteMapper;
import puc.tcc.vet.model.Cliente;
import puc.tcc.vet.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteService {

    private final ClientRepository repository;

    private final ClienteMapper clienteMapper;

    public List<Cliente> readAll() {
        return (List<Cliente>) repository.findAll();
    }

    public Cliente create(ClienteDto dto) {
        return repository.save(clienteMapper.toModel(dto));
    }

    public Cliente update(ClienteDto dto) {
        var cliente = clienteMapper.toModel(dto);
        Optional<Cliente> aux = repository.findById(cliente.getId());
        if (aux.isPresent()) {
            return repository.save(aux.get());
        } else {
            throw new RuntimeException("Objet not found for this id :: " + cliente.getId());
        }
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }




}
