package top.leeyangy.service;

import top.leeyangy.dao.UserDao;
import top.leeyangy.dao.UserDaoImpl;

/**
 * Created by leeyangy on 2021/7/22 20:10
 */
public class UserServiceImpl implements UserService {

    //    业务层调用到层
    private UserDao userDao = new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }

    //    利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
