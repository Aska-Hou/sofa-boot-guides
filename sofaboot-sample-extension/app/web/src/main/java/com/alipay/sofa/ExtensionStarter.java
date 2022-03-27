package com.alipay.sofa;

import com.alipay.sofa.common.service.facade.Facade1;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Aska
 * @description Function Description
 * @create 2022/3/26 16:25
 */
@SpringBootApplication
public class ExtensionStarter {

    // init the logger
    private static final Logger LOGGER = LoggerFactory.getLogger(ExtensionStarter.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExtensionStarter.class, args);
    }

}
