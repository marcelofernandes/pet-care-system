package puc.tcc.vet.mapper;

import puc.tcc.vet.dto.UserDto;
import puc.tcc.vet.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDto toDto(User user);

    User toModel(UserDto userDto);
}
