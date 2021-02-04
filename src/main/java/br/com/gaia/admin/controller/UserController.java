package br.com.gaia.admin.controller;

import br.com.gaia.admin.model.User;
import br.com.gaia.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/gaia-user-account/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path= "/user")
    public ResponseEntity<User> createUser(@ResponseBody User user){
     try {
        User createUser = userService.save(user);
         return new ResponseEntity<>(createUser, HttpStatus.OK);
     }catch (Exception e){
         return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
     }
    }

    @GetMapping
    public @ResponseBody
    Iterable<User> listUser(){
        return userService.list();
    }

    @PutMapping

    @GetMapping

    @DeleteMapping


}
