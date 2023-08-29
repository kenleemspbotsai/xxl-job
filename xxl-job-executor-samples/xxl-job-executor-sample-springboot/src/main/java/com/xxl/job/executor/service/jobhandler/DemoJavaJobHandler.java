package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoJavaJobHandler {

    private static final Logger logger = LoggerFactory.getLogger(DemoJavaJobHandler.class);

    @XxlJob("demoJavaJobHandler")
    public void demoJavaJobHandler() throws Exception {
        logger.info("XXL-JOB, Hello World - demoJavaJobHandler.");
    }
}
