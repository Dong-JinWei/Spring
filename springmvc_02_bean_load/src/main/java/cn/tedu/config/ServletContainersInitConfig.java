package cn.tedu.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    // 加载springmvc配置类
    protected WebApplicationContext createServletApplicationContext() {
        // 初始化webApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    // 设置由springmvc控制器处理请求映射路径
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    // 加载spring配置类
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
