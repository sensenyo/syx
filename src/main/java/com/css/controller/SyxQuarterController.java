package com.css.controller;

import com.css.result.Result;
import com.css.result.Status;
import com.css.service.SyxQuarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author css
 * @date 2022/9/16 16:50
 * 季度的表述层
 */
@RestController
@RequestMapping("/syxQuarter")
public class SyxQuarterController {
    @Autowired
    private SyxQuarterService syxQuarterService;

    /**
     * 获得所有季度
     * @return 所有季度
     */
    @GetMapping("/list")
    public Result getSyxQuarterList(){
        return Result.buildR(Status.OK, syxQuarterService.list(null));
    }
}
