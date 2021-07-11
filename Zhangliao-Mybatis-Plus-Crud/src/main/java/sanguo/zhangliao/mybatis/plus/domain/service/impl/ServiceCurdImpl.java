package sanguo.zhangliao.mybatis.plus.domain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sanguo.zhangliao.mybatis.plus.domain.db.entity.TStation;
import sanguo.zhangliao.mybatis.plus.domain.db.service.ITStationService;
import sanguo.zhangliao.mybatis.plus.domain.service.IServiceCurd;


/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-06-14 20:22
 **/

@Slf4j
@Service
public class ServiceCurdImpl implements IServiceCurd {
    @Autowired
    ITStationService itStationService;

    @Override
    public String getObjDemo() {
        LambdaQueryWrapper<TStation> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(TStation::getId, 1);
        //返回select的第一个字段
        return itStationService.getObj(queryWrapper,
                obj -> "用户：" +  obj.toString());

    }

    @Override
    public TStation getOneDemo() {
        LambdaQueryWrapper<TStation> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(TStation::getId, -1);
        //返回select的第一个字段
        return itStationService.getOne(queryWrapper);
    }
}
