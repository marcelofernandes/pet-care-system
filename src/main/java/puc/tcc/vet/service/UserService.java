package puc.tcc.vet.service;

import puc.tcc.vet.dto.UserDto;
import puc.tcc.vet.mapper.UserMapper;
import puc.tcc.vet.model.User;
import puc.tcc.vet.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserDto create(UserDto userDto) {
        userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        var user = userRepository.save(userMapper.toModel(userDto));
        return userMapper.toDto(user);
    }

    public Optional<User> getByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

