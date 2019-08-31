package cn.gsq.service.Impl;

import cn.gsq.dao.UserDao;
import cn.gsq.domain.User;
import cn.gsq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("user Service的findAll方法执行了");
        return userDao.findAll();
    }

    public void addUser(User user) {
        userDao.addUser(user);

    }
}
