package com.carmark.service;

/**
 * Created by My on 2018/11/10.
 */
import com.carmark.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}

