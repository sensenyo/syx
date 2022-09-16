package com.css.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.css.domain.SyxCity;

import java.util.List;

/**
 * @author css
 * @date 2022/9/16 16:29
 */
public interface SyxCityService extends IService<SyxCity> {
    /**
     * 城市三级结构
     * @return 三级结构
     */
    List<SyxCity> getCityTree();
}
