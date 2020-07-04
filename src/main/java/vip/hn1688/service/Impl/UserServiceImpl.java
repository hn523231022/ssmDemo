package vip.hn1688.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import vip.hn1688.dao.UserMapper;
import vip.hn1688.entity.User;
import vip.hn1688.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
    private UserMapper userDao;
    @Override
    public User getUserById(String userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}
