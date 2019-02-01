package com.example.demo;

import com.lzn.Application;
import com.lzn.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {
    @Autowired
    private UserService userSerivce;

//    @Before
//    public void setUp() {
//        // 准备清空user表
//        userSerivce.deleteAllUsers();
//    }

    @Test
    public void test() throws Exception {
        // 插⼊5个⽤户
        userSerivce.create("a", 1);
        userSerivce.create("b", 2);
        userSerivce.create("c", 3);
        userSerivce.create("d", 4);
        userSerivce.create("e", 5);
        // 查数据库，应该有5个⽤户
        Assert.assertEquals(5, userSerivce.getAllUsers().intValue());
        // 删除两个⽤户
        userSerivce.deleteByName("a");
        userSerivce.deleteByName("e");
        // 查数据库，应该有5个⽤户
        Assert.assertEquals(3, userSerivce.getAllUsers().intValue());
    }
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    @Rollback
//    public void findByName() throws Exception {
//        userMapper.insert("AAA", 20);
//        User u = userMapper.findByName("AAA");
//        Assert.assertEquals(20, u.getAge().intValue());
//    }
}
