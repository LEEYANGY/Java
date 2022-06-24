package xyz.leeyangy.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.leeyangy.blog.domain.User;

/**
 * @author LEEYANGY
 * @date 2022/6/24 17:03
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
