package com.css.controller;

import com.css.domain.SyxCity;
import com.css.result.Result;
import com.css.result.Status;
import com.css.service.SyxCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author css
 * @date 2022/9/16 16:29
 * 城市表的表述层
 */
@RestController
@RequestMapping("/syxCity")
public class SyxCityController {
    @Autowired
    private SyxCityService syxCityService;

    /**
     * 城市三级结构
     * @return 结果
     */
    @GetMapping("/tree")
    public Result getCityTree(){
        List<SyxCity> cityList = syxCityService.getCityTree();
        return Result.buildR(Status.OK,cityList);
    }
}
