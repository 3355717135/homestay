package com.bestyyq.homestay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestyyq.homestay.domain.User;
import com.bestyyq.homestay.service.UserService;
import com.bestyyq.homestay.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 33557
* @description 针对表【user(用户账号表)】的数据库操作Service实现
* @createDate 2023-10-16 20:26:56
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




