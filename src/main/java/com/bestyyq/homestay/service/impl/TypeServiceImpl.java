package com.bestyyq.homestay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestyyq.homestay.domain.Type;
import com.bestyyq.homestay.service.TypeService;
import com.bestyyq.homestay.mapper.TypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 33557
* @description 针对表【type(房屋类型表)】的数据库操作Service实现
* @createDate 2023-10-16 20:26:56
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

}




