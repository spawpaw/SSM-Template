package com.spawpaw.ssmtemplate.common.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author BenBenShang 2017/4/1.
 * @version: 1.0
 * @copyright: <p> 2017.2.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * <p>
 * Description for this class:
 * 设置路径大小写不敏感
 * 例如
 * /LOGIN
 * /login
 * 将视为相同的路径
 */
@Configuration
public class SpringControllerCaseInsensitiveFilter extends WebMvcConfigurationSupport {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        AntPathMatcher pathMatcher = new AntPathMatcher();
        pathMatcher.setCaseSensitive(false);
        configurer.setPathMatcher(pathMatcher);
    }

}
