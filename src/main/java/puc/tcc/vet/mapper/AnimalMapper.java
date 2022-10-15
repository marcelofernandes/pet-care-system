package puc.tcc.vet.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import puc.tcc.vet.dto.AnimalDto;
import puc.tcc.vet.model.Animal;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AnimalMapper {

    AnimalDto toDto(Animal animal);

    Animal toModel(AnimalDto animalDto);
}
