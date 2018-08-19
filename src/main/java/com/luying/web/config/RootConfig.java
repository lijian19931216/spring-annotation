package com.luying.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-19
 **/
@ComponentScan(value = "com.luying",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})
public class RootConfig {
}
