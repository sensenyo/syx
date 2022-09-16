package com.css.service.impl;

import com.css.domain.DTO.SyxCityGameQuarterDTO;
import com.css.domain.SyxCityGameQuarter;
import com.css.mapper.SyxCityGameQuarterMapper;
import com.css.service.SyxCityGameQuarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author css
 * @date 2022/9/16 15:03
 */
@Service
public class SyxCityGameQuarterServiceImpl implements SyxCityGameQuarterService {
    @Autowired
    private SyxCityGameQuarterMapper syxCityGameQuarterMapper;
    /**
     * 根据Id查询事件
     *
     * @param cityGameQuarterId 事件id
     * @return 结果
     */
    @Override
    public SyxCityGameQuarter getSyxCityGameQuarterById(Integer cityGameQuarterId) {
        return syxCityGameQuarterMapper.getSyxCityGameQuarterById(cityGameQuarterId);
    }

    /**
     * 分页查询
     *
     * @param syxCityGameQuarterDTO 查询条件
     * @return 结果
     */
    @Override
    public List<SyxCityGameQuarter> getSyxCityGameQuarterPage(SyxCityGameQuarterDTO syxCityGameQuarterDTO) {
        return syxCityGameQuarterMapper.getSyxCityGameQuarterPage(syxCityGameQuarterDTO);
    }
}
