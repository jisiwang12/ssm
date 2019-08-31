package cn.gsq.dao;

import cn.gsq.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户持久层接口
 */
@Repository
public interface UserDao {
    /**
     * 找到所有用户的信息
     * @return
     */
    @Select("select * from user")
    public List<User> findAll();

    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into user(username, sex) values (#{username},#{sex})")
    public void addUser(User user);
}
