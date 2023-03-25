package com.java.sourcebackend.service.mapper;

import com.java.sourcebackend.domain.User;
import com.java.sourcebackend.service.dto.SaveUserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaveUserMapper implements EntityMapper<User, SaveUserDTO> {

    @Override
    public SaveUserDTO toDTO(User entity) {
        return null;
    }

    @Override
    public User toEntity(SaveUserDTO dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        return user;
    }

    @Override
    public List<SaveUserDTO> toDTO(List<User> entities) {
        return null;
    }

    @Override
    public List<User> toEntity(List<SaveUserDTO> dtoList) {
        return null;
    }
}
