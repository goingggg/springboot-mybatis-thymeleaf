package com.xiaoyin.controller;

import com.xiaoyin.dao.RegisterMapper;
import com.xiaoyin.dao.StudentMapper;
import com.xiaoyin.entity.Register;
import com.xiaoyin.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
 * @author xiaoyin
 * @date 2020/7/3 15:13
 */
@Controller
public class UserController {
    @Autowired
    RegisterMapper registerMapper;
    @RequestMapping(value = {"", "user"}, method = RequestMethod.GET)
    public String user(Model model) {
        List<Register> registers = registerMapper.selectAll();
        model.addAttribute("registers", registers);
        return "index";
    }
}
