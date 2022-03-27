package com.alipay.sofa.service;

import com.alipay.sofa.common.service.facade.Facade1;

/**
 * @author Aska
 * @description Function Description
 * @create 2022/3/26 20:44
 */
public class FacadeServiceImpl implements Facade1 {
    @Override
    public String hello() {
        return "Hello Sofa Boot.";
    }
}
