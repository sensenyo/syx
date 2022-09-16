package com.css.controller;

import com.css.result.Result;
import com.css.result.Status;
import com.css.service.SyxGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author css
 * @date 2022/9/16 16:50
 * 比赛的表述层
 */
@RestController
@RequestMapping("/syxGame")
public class SyxGameController {
    @Autowired
    private SyxGameService service;

    /**
     * 获得所有比赛
     * @return 所有比赛
     */
    @GetMapping("/list")
    public Result getSyxGameList(){
        return Result.buildR(Status.OK,service.list(null));
    }
}
