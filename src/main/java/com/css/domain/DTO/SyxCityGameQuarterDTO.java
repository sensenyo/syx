package com.css.domain.DTO;

import lombok.Data;

/**
 * @author css
 * @date 2022/9/16 12:15
 * 事件实体类 条件
 */
@Data
public class SyxCityGameQuarterDTO {
    //事件id
    private Integer id;
    //对应城市
    private String cityName;
    //对应比赛
    private String syxGameName;
    //对应比赛开始类型
    private String syxQuarterName;
    //开始日期
    private String date;
}
