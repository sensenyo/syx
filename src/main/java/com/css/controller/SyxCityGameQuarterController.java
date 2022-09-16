package com.css.controller;


import com.css.domain.DTO.SyxCityGameQuarterDTO;
import com.css.domain.SyxCityGameQuarter;
import com.css.result.Result;
import com.css.result.Status;
import com.css.service.SyxCityGameQuarterService;
import com.css.service.impl.SyxCityGameQuarterServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author css
 * @date 2022/9/16 14:22
 * 事件的Controller层
 */

@RestController
@RequestMapping("/affair")
public class SyxCityGameQuarterController {
    @Autowired
    private SyxCityGameQuarterService cityGameQuarterService;

    /**
     * 根据id获得事件对象
     * @param cityGameQuarterId 事件对象id
     * @return 结果
     */
    @GetMapping("/{cityGameQuarterId}")
    public Result getSyxCityGameQuarter(@PathVariable Integer cityGameQuarterId){
        SyxCityGameQuarter syxCityGameQuarter = cityGameQuarterService.getSyxCityGameQuarterById(cityGameQuarterId);
        return Result.buildR(Status.OK,
                syxCityGameQuarter);
    }

    /**
     * 根据条件
     * @param pageNum
     * @param pageSize
     * @param SyxCityGameQuarterDTO
     * @return
     */
    @GetMapping("/{pageNum}/{pageSize}")
    public Result getSyxCityGameQuarterPage(@PathVariable Integer pageNum,
                                            @PathVariable Integer pageSize,
                                            SyxCityGameQuarterDTO SyxCityGameQuarterDTO){
        //开启分页
        PageHelper.startPage(pageNum,pageSize);
        //查询
        List<SyxCityGameQuarter> syxCityGameQuarter = cityGameQuarterService.getSyxCityGameQuarterPage(SyxCityGameQuarterDTO);
        //封装分页
        return Result.buildR(Status.OK,PageInfo.of(syxCityGameQuarter));
    }
}
