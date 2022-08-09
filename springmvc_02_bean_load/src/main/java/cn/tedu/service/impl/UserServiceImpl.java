package cn.tedu.service.impl;

import cn.tedu.domain.User;
import cn.tedu.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        System.out.println("user service....");
    }
}
