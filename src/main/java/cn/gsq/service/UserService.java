package cn.gsq.service;

import cn.gsq.domain.User;

import java.util.List;

/**
 * User的业务层接口
 * @author mechrevo
 */
public interface UserService {
    /**
     * 找到所有用户
     * @return
     */
    public List<User> findAll();
}
