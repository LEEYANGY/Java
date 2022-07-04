package xyz.leeyangy.blog.service;

import xyz.leeyangy.blog.domain.User;

/**
 * @author LEEYANGY
 * @date 2022/6/24 17:00
 */
public interface UserService {
    User checkUser(String username, String password);
}
