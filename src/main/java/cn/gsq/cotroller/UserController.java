package cn.gsq.cotroller;

import cn.gsq.domain.User;
import cn.gsq.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 用户的控制器
 * @author mechrevo
 */
@Controller
@RequestMapping("/user") //一级目录
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 找到所有用户
     * @param modelMap
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model modelMap) {
        List<User> users = userService.findAll();
        modelMap.addAttribute("list", users);
        return "success";
    }

    /**
     * 添加用户
     * @param request
     * @param response
     * @param user
     * @throws IOException
     */
    @RequestMapping("/addUser")
    public void addUser(HttpServletRequest request, HttpServletResponse response,User user) throws IOException {
        userService.addUser(user);
        response.sendRedirect(request.getContextPath() + "/user/findAll");
        return;
    }
}
