package com.alipay.sofa.user.service;

import com.alipay.sofa.common.service.facade.Facade1;
import com.alipay.sofa.common.service.facade.ReplyHello;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Aska
 * @description Function Description
 * @create 2022/3/26 21:29
 */
@SofaService
public class ReplyHelloImpl implements ReplyHello {

    @Autowired
    public Facade1 facade1;

    @Override
    public void replyHello(){
        System.out.println(facade1.hello());
        System.out.println("[sofa]: Hi Aska");
    }

}
