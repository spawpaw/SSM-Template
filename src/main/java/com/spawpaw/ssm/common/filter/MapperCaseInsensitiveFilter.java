package com.spawpaw.ssm.common.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author BenBenShang  2017.2.21 spawpaw@hotmail.com
 *         <p>
 * @ 设置路径大小写不敏感
 * 例如`/LOGIN`和`/login`将视为相同的路径
 */
@Configuration
public class MapperCaseInsensitiveFilter extends WebMvcConfigurationSupport {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        AntPathMatcher pathMatcher = new AntPathMatcher();
        pathMatcher.setCaseSensitive(false);
        configurer.setPathMatcher(pathMatcher);
    }

}
