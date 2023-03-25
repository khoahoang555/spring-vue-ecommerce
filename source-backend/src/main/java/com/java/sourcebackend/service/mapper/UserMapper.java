package com.java.sourcebackend.service.mapper;

import com.java.sourcebackend.domain.User;
import com.java.sourcebackend.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMapper implements EntityMapper<User, UserDTO> {

    @Override
    public UserDTO toDTO(User entity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(entity.getEmail());
        userDTO.setEnabled(entity.isEnabled());
        userDTO.setId(entity.getId());
        return userDTO;
    }

    @Override
    public User toEntity(UserDTO dto) {
        return null;
    }

    @Override
    public List<UserDTO> toDTO(List<User> entities) {
        return entities.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<User> toEntity(List<UserDTO> dtoList) {
        return null;
    }
}
