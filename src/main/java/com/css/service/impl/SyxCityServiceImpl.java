package com.css.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.css.domain.SyxCity;
import com.css.mapper.SyxCityMapper;
import com.css.service.SyxCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author css
 * @date 2022/9/16 16:30
 */
@Service
public class SyxCityServiceImpl extends ServiceImpl<SyxCityMapper, SyxCity> implements SyxCityService {
    @Autowired
    private SyxCityMapper syxCityMapper;

    /**
     * 城市三级结构
     *
     * @return 三级结构
     */
    @Override
    public List<SyxCity> getCityTree() {
        //获取全部的城市
        List<SyxCity> syxCities = syxCityMapper.selectList(null);
        //存储全部id容器
        List<Integer> idList = new ArrayList<>();
        //存储根节点
        List<SyxCity> root = new ArrayList<>();
        //存储全部id
        syxCities.forEach(syxCity -> {idList.add(syxCity.getId());});
        //遍历
        for (SyxCity syxCity : syxCities) {
            //如果parentId不在集合中,说明他是根节点
            if(!idList.contains(syxCity.getParentId())){
                root.add(syxCity);
            }
            List<SyxCity> child = new ArrayList<>();
            //遍历
            syxCities.forEach(city -> {
                //如果父类id与便利时id相同,则是它的子类
                if(Objects.equals(city.getParentId(), syxCity.getId()))
                    child.add(city);
            });
            syxCity.setChildSyxCity(child);
        }
        return root;
    }
}
