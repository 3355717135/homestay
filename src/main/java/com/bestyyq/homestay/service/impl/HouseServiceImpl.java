package com.bestyyq.homestay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestyyq.homestay.domain.House;
import com.bestyyq.homestay.service.HouseService;
import com.bestyyq.homestay.mapper.HouseMapper;
import org.springframework.stereotype.Service;

/**
* @author 33557
* @description 针对表【house(房屋表)】的数据库操作Service实现
* @createDate 2023-10-16 20:26:56
*/
@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House>
    implements HouseService{

}




