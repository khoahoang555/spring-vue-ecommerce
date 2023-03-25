package com.java.sourcebackend.service;

import com.java.sourcebackend.domain.User;
import com.java.sourcebackend.repository.UserRepository;
import com.java.sourcebackend.service.dto.SaveUserDTO;
import com.java.sourcebackend.service.dto.UserDTO;
import com.java.sourcebackend.service.mapper.SaveUserMapper;
import com.java.sourcebackend.service.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    private final SaveUserMapper saveUserMapper;

    public UserService(
            UserRepository userRepository,
            UserMapper userMapper,
            SaveUserMapper saveUserMapper
    ) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.saveUserMapper = saveUserMapper;
    }

    public UserDTO createUser(SaveUserDTO saveUserDTO) {
        User user = saveUserMapper.toEntity(saveUserDTO);
        return userMapper.toDTO(userRepository.save(user));
    }

    public List<UserDTO> getAllUsers() {
        return userMapper.toDTO(userRepository.findAll());
    }
}
