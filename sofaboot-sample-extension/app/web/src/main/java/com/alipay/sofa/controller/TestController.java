package com.alipay.sofa.controller;

import com.alipay.sofa.common.service.facade.Facade1;
import com.alipay.sofa.common.service.facade.ReplyHello;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aska
 * @description Function Description
 * @create 2022/3/26 20:55
 */
@RestController
public class TestController {

    @SofaReference
    public ReplyHello replyHello;

    @RequestMapping("/hello")
    public void hello(){
        replyHello.replyHello();
    }
}
