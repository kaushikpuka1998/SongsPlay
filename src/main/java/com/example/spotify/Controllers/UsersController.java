package com.example.spotify.Controllers;

import com.example.spotify.Entities.Users;
import com.example.spotify.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public Users addUser(@RequestBody Users user) {
        return userService.addUser(user);
    }
}
