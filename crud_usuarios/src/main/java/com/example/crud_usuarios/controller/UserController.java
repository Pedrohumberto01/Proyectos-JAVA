package com.example.crud_usuarios.controller;

import com.example.crud_usuarios.entity.User;
import com.example.crud_usuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/Users") // definimos el nombre de la ruta
public class UserController {

    @Autowired // Para inyectar dependencias
    private final UserService userService; // agregamos el servicio y creamos el constructor

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Metodo para listar
    @GetMapping
    public List<User> getAll(){
        return userService.getUsers();
    }

    // Buscar usuario por el id
    @GetMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable("userId") int id){
        return userService.getUserById(id);
    }

    // Metodo para Guardar o Actualizar
    @PostMapping
    public void saveUser(@RequestBody User user){
        userService.saveOrUpdate(user);
    }

    // Metodo para eliminar un usuario por id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") int id){
        userService.deleteUser(id);
    }
}
