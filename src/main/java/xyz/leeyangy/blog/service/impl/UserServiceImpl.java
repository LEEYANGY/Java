package xyz.leeyangy.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.leeyangy.blog.dao.UserRepository;
import xyz.leeyangy.blog.domain.User;
import xyz.leeyangy.blog.service.UserService;
import xyz.leeyangy.blog.utils.MD5Utils;

/**
 * @author LEEYANGY
 * @date 2022/6/24 17:01
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user=userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
