package br.com.gaia.admin.service;

import br.com.gaia.admin.model.User;
import br.com.gaia.admin.repository.UserRepository;
import br.com.gaia.admin.util.UserValidation;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserValidation userValidation;

    public User save(User user) throws Exception{

        userValidation.validate(user);
        return userRepository.save(user);
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User update(Integer userId, User user) throws Exception {

        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isPresent()){
            user.setId(userId);
            userValidation.validate(user);
        }
    }

    public Iterable<User> list() {
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public User getUser(Integer userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null);
    }

    public User deleteUser(Integer userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()){
            User deleteUser = userOptional.get();
            userRepository.delete(deleteUser);
            return deleteUser;
        } else {
            return null;
        }
    }
}
