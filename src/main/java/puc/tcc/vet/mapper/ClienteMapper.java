package puc.tcc.vet.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import puc.tcc.vet.dto.ClienteDto;
import puc.tcc.vet.model.Cliente;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClienteMapper {

    ClienteDto toDto(Cliente model);

    Cliente toModel(ClienteDto dto);
}
