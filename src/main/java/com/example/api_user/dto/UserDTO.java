package com.example.api_user.dto;


import lombok.Data;

// é um padrão de design utilizado para transferir dados entre diferentes partes de uma aplicação
@Data
public class UserDTO {
    private int id;
    private String username;
    private String email;
    private  String password;
}
