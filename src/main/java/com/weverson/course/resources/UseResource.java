package com.weverson.course.resources;

import com.weverson.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UseResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1l,"Maria","Maria@gmail.com","9999999","12345");
        return ResponseEntity.ok().body(u);

    }
}
