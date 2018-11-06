package com.github.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 通用属性
 *
 * @author jiangyf
 * @date 2018/3/8
 */
@Component
@ConfigurationProperties(prefix = "general") // 注入带general前缀的属性
public class GeneralProperties {
    private String appName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
