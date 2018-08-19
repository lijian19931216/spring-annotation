package com.luying.tx;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-19
 **/
@Configuration
@EnableTransactionManagement//开启基于注解的事务管理功能,并将PlatformTransactionManager注册到容器中
public class TransactionConfig {
}
