package com.css.service;

import com.css.domain.DTO.SyxCityGameQuarterDTO;
import com.css.domain.SyxCityGameQuarter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author css
 * @date 2022/9/16 15:03
 */
public interface SyxCityGameQuarterService {
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
    List<SyxCityGameQuarter> getSyxCityGameQuarterPage(@Param("syxCityGameQuarterDTO") SyxCityGameQuarterDTO syxCityGameQuarterDTO);

}
