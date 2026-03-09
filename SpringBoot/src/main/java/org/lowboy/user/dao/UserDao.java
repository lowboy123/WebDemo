package org.lowboy.user.dao;

import org.lowboy.entity.UserBo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<UserBo> allList();
}
