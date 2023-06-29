package com.eco.mx.mitouserservice.model.entity;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@Document(collection = "user")
public class UserEntity {

    @Id
    private String id;
    @Size(min = 8)
    @NotNull
    private String name;

    @Valid
    @Size()
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String[] roles;


}
