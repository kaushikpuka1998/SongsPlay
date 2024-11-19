package com.example.spotify.Repositories;

import com.example.spotify.Entities.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
    Users findByEmail(String email);
    Users findByUsernameAndPassword(String username, String password);
    Users findByEmailAndPassword(String email, String password);
    Users findByUsernameAndEmail(String username, String email);
    Users findByUsernameAndEmailAndPassword(String username, String email, String password);
}
