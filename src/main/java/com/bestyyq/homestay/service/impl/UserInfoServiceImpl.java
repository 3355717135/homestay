package com.bestyyq.homestay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestyyq.homestay.domain.UserInfo;
import com.bestyyq.homestay.service.UserInfoService;
import com.bestyyq.homestay.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 33557
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2023-10-16 20:26:56
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




