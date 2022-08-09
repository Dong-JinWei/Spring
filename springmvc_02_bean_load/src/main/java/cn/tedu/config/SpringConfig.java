package cn.tedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
// 1。 指定spring扫描service 和 dao包，不要扫描controller
//@ComponentScan({"cn.tedu.service", "cn.tedu.dao"})
// 2. 扫描cn.tedu根包，但排除controller
@ComponentScan(value = "cn.tedu",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)
public class SpringConfig {

}
