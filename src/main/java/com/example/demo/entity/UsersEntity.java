package com.example.demo.entity;


import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Data
@Table(name= "users")
public class UsersEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "user_name")
    @NotNull(message = "Имя пользователя не может быть пустым")
    private String name;
    @NotNull(message = "Пароль не может быть пустым")
    private String password;
    @NotNull
    private Boolean role;
}
