package br.com.gaia.admin.controller;

import br.com.gaia.admin.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (path = "/api/account/v1")
public class UserController {

//    @Autowired
//    private UserServiceImpl userServiceImpl;

    @PostMapping(path = "/user")
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario) {
        try {


//            User createUser = userServiceImpl.save(user);


            return new ResponseEntity<>(usuario, HttpStatus.OK);


        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }



}
