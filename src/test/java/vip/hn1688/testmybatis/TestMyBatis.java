package vip.hn1688.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import vip.hn1688.entity.User;
import vip.hn1688.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
//  private ApplicationContext ac = null;
    @Resource
    private UserService userService = null;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        User user = userService.getUserById("1");
        // System.out.println(user.getUserName());
        // logger.info("ֵ��"+user.getUserName());
        logger.info(JSON.toJSONString(user));
        System.out.println(JSON.toJSONString(user));
    }
}
