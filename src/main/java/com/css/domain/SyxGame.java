package com.css.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName syx_game
 */
@TableName(value ="syx_game")
@Data
public class SyxGame implements Serializable {
    /**
     * 比赛id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 比赛名
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}