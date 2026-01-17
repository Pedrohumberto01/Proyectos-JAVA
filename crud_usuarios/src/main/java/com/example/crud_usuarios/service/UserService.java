package com.example.crud_usuarios.service;

import com.example.crud_usuarios.entity.User;
import com.example.crud_usuarios.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // Devolver la lista de usuarios
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    // Busca y devulelve un usuario por id
    public Optional<User> getUserById(int id){
        return userRepository.findById(id);
    }

    // Guarda el registro de usuario
    public void saveOrUpdate(User user){
        userRepository.save(user);
    }

    // Elimina el registro de un usuario
    public void deleteUser(int id){
        userRepository.deleteById(id);
    }
}
