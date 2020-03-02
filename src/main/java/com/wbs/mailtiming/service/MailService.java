package com.wbs.mailtiming.service;

/**
 * 邮件发送服务
 *
 * @author: wangbingshuai
 * @create: 2020-02-29 19:48
 **/
public interface MailService {
    /**
     * 发送普通邮件
     *
     * @param to      接收人邮箱
     * @param subject 标题
     * @param content 内容
     */
    void sendSimpleMail(String to, String subject, String content);

    /**
     * 发送HTML邮件
     *
     * @param to      接收人邮箱
     * @param subject 标题
     * @param content 正文HTML
     */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * 发送带附件的邮件
     *
     * @param to       接收人邮箱
     * @param subject  标题
     * @param content  内容
     * @param filePath 附件本地路径
     */
    void sendAttachmentMail(String to, String subject, String content, String filePath);

    /**
     * 发送带图片的邮件
     *
     * @param to      接收人邮箱
     * @param subject 标题
     * @param content 正文HTML内容
     * @param rscPath 图片本地路径
     * @param rscId   图片ID
     */
    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
