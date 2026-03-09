package org.lowboy.user.service;

import org.lowboy.entity.UserBo;
import org.lowboy.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserBo> allList() {
        return userDao.allList();
    }
}
