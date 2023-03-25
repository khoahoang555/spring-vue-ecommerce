package com.java.sourcebackend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "auth_user")
public class User {

    @Id
    private UUID id = UUID.randomUUID();

    @Column(name = "email", length = 64, nullable = false)
    private String email;

    @Column(name = "password", length = 64)
    private String password;

    @Column(name = "is_enabled", columnDefinition = "boolean default false")
    private boolean isEnabled;

    @Column(name = "is_deleted", columnDefinition = "boolean default false")
    private boolean isDeleted;
}
