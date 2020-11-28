package com.example.helloworld.resources;

import com.example.helloworld.controller.UserDaoService;
import com.example.helloworld.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
   UserDaoService userDaoService ;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return  userDaoService.findAll();
    }

    @GetMapping("/user/{id}")
    public User retrieveUser(@PathVariable Integer id){
        return  userDaoService.findOne(id);
    }

    @PostMapping("/createuser")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("{id}")
                        .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/deleteuser/{id}")
    public User deleteUser(@PathVariable Integer id){
        return  userDaoService.deleteById(id);

    }
}


