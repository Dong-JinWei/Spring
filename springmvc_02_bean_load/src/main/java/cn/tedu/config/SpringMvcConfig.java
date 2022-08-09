package cn.tedu.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 表示该类是配置类
@Configuration
// 包扫描 扫描控制层
@ComponentScan("cn.tedu.controller")
public class SpringMvcConfig {
}
