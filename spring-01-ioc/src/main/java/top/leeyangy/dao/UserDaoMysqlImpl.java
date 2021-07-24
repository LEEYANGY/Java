package top.leeyangy.dao;

/**
 * Created by leeyangy on 2021/7/22 20:33
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("MySQL获取用户数据");
    }
}
