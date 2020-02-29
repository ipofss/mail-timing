package com.wbs.mailtiming.service.impl;

import com.wbs.mailtiming.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * 发送邮件服务实现
 *
 * @author: wangbingshuai
 * @create: 2020-02-29 19:59
 **/
@Service
@Slf4j
public class MailServiceImpl implements MailService {

    @Value("${mail.fromMail.addr}")
    private String from;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);
        log.info("简单邮件已经发送");
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content) {

    }

    @Override
    public void sendAttachmentMail(String to, String subject, String content, String filePath) {

    }

    @Override
    public void sendImgResourceMail(String to, String subject, String content, String rscPath, String rscId) {

    }
}
