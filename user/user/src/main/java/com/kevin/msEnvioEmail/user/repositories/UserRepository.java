package com.kevin.msEnvioEmail.user.repositories;

import com.kevin.msEnvioEmail.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
