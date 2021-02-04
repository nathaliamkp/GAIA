package br.com.gaia.admin.controller;

import br.com.gaia.admin.model.User;
import br.com.gaia.admin.service.UserService;
import org.graalvm.compiler.lir.LIRInstruction;
import static java.util.Objects.nonNull;


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


    @GetMapping (path ="/user")
    public @ResponseBody
    Iterable<User> listUser(){
        return userService.list();
    }


    @PutMapping(path = "/user/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Integer userId, @RequestBody User user){
        try{
            User updatedUser = null;
            updatedUser = userService.update(userId, user);
            if (nonNull(updatedUser)){
                return new ResponseEntity<>(updatedUser, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping (path = "/user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Integer userId){
        User getUser = userService.getUser(userId);
        if(nonNull(getUser)){
            return new ResponseEntity<>(getUser, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping (path = "/user/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable Integer userId){
        User deleteUser = userService.deleteUser(userId);
        if (nonNull(deleteUser)){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

