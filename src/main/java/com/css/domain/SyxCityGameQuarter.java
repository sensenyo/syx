package com.css.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author css
 * @date 2022/9/16 12:15
 * 事件实体类
 */
@Data
public class SyxCityGameQuarter {
    //事件id
    private Integer id;
    //对应城市
    private SyxCity city;
    //对应比赛
    private SyxGame syxGame;
    //对应比赛开始类型
    private SyxQuarter syxQuarter;
    //开始日期
    private String date;
}
