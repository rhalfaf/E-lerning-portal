package elerning.Service;

import elerning.Model.User;
import elerning.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByLogin(String login) {
        User user = userRepository.findByLogin(login);
        return user;
    }

    @Override
    public User findByName(String name) {
        User user = userRepository.findByName(name);
        return user;
    }
}
