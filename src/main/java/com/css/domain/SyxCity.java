package com.css.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

/**
 * @author css
 * @date 2022/9/16 12:09
 * 城市实体类
 */
@Data
public class SyxCity {
    //城市id
    private Integer id;
    //城市名
    private String name;
    //子城市(树状结构)
    @TableField(exist = false)
    private List<SyxCity> childSyxCity;
    //父城市id
    private Integer parentId;
}
