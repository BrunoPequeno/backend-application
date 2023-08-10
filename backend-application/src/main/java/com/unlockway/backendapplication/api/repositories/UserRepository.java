package com.unlockway.backendapplication.api.repositories;

import com.unlockway.backendapplication.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

}
