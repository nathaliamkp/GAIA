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
    }

    public User update(Integer userId, User user) {
    }

    public User getUser(Integer userId) {
    }
}
