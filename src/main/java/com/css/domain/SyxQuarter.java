package com.css.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName syx_quarter
 */
@TableName(value ="syx_quarter")
@Data
public class SyxQuarter implements Serializable {
    /**
     * 季度id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 季度
     */
    private String quarter;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}