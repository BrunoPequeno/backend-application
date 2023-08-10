package com.unlockway.backendapplication.api.services;

import com.unlockway.backendapplication.api.dto.UserDTO;
import com.unlockway.backendapplication.api.repositories.UserRepository;
import com.unlockway.backendapplication.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll(){
        List<UserModel> result = userRepository.findAll();

        return result.stream().map(UserDTO::new).toList();
    }
}
