package com.xiaoyin;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoyin.dao.RegisterMapper;
import com.xiaoyin.entity.Register;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringThymeleafApplication.class)
@Transactional
@Rollback
public class tkmybaitesTest {

    @Autowired
    private RegisterMapper registerMapper;
    @Test
    public void testselect(){
        List<Register> registers=registerMapper.selectAll();
        for (Register register:registers){
            System.out.println(register.getUsername());
        }
    }

    @Test
    public void testPage(){//使用tkmybaties分页
        PageHelper.startPage(1,4);
        Example example=new Example(Register.class);
        PageInfo<Register> PageInfo=new PageInfo<>(registerMapper.selectByExample(example));
        List<Register> list=PageInfo.getList();
        for (Register register:list){
            System.out.println(register.getUsername());
        }
    }
}
