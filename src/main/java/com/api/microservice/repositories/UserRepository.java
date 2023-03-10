package com.api.microservice.repositories;

import com.api.microservice.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {

    boolean existsByEmail(String email);
    boolean existsByCpf(String cpf);

    UserModel findByEmail(String email);
}
