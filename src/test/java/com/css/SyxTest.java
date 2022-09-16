package com.css;

import com.css.domain.SyxCityGameQuarter;
import com.css.service.impl.SyxCityGameQuarterServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author css
 * @date 2022/9/16 12:02
 */
@SpringBootTest
public class SyxTest {
    @Autowired
    private SyxCityGameQuarterServiceImpl syxCityGameQuarterService;
    @Test
    public void  test()
    {
        SyxCityGameQuarter syxCityGameQuarterById = syxCityGameQuarterService.getSyxCityGameQuarterById(1);
        System.out.println(syxCityGameQuarterById);
    }
}
