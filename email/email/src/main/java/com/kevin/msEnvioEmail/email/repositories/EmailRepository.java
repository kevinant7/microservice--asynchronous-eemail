package com.kevin.msEnvioEmail.email.repositories;

import com.kevin.msEnvioEmail.email.models.EmailModel;
import jakarta.validation.constraints.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
