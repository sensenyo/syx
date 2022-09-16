package com.css.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.css.domain.DTO.SyxCityGameQuarterDTO;
import com.css.domain.SyxCityGameQuarter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author css
 * @date 2022/9/16 13:10
 * 事件Mapper
 */
@Mapper
public interface SyxCityGameQuarterMapper extends BaseMapper<SyxCityGameQuarter> {

    /**
     * 根据Id查询事件
     * @param cityGameQuarterId 事件id
     * @return 结果
     */
    SyxCityGameQuarter getSyxCityGameQuarterById(Integer cityGameQuarterId);

    /**
     * 分页查询
     * @param syxCityGameQuarterDTO 查询条件
     * @return 结果
     */
    List<SyxCityGameQuarter> getSyxCityGameQuarterPage(SyxCityGameQuarterDTO syxCityGameQuarterDTO);
}
