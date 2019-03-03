package com.springboot.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class helloTest1 {

    //记录器
    Logger logger=LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoader() {
        /*日志级别 由低到高*/
        logger.trace("trace....");
        logger.debug("debug....");

        //springboot 默认使用的info以上级别的
        logger.info("info....");
        logger.warn("warn....");
        logger.error("err....");
    }
}
