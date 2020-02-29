package com.wbs.mailtiming.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 发送邮件测试类
 *
 * @author: wangbingshuai
 * @create: 2020-02-29 20:04
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void sendSimpleMailTest() {
        mailService.sendSimpleMail("1264747002@qq.com", "简单邮件标题", "简单邮件内容");
    }
}
