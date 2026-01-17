package com.example.crud_usuarios.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_user") // definir el nombre de la tabla en la bd
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String firstName;

    private String lastName;

    @Column(name = "email_addres", unique = true, nullable = false) // Definir el nombre de la columna en la bd, con email unico
    private String email;
}
