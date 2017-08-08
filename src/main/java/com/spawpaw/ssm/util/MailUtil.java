package com.spawpaw.ssm.util;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import java.util.List;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/7/19
 */
public class MailUtil {
    private static MailSender mailSender;
    private static SimpleMailMessage simpleMailMessage;

    //Spring 依赖注入
    public void setMailSender(MailSender mailSender) {
        MailUtil.mailSender = mailSender;
    }

    //Spring 依赖注入
    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
        MailUtil.simpleMailMessage = simpleMailMessage;
    }

    /**
     * 单发
     *
     * @param recipient 收件人
     * @param subject   主题
     * @param content   内容
     */
    public static void send(String recipient, String subject, String content) {
        simpleMailMessage.setTo(recipient);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        mailSender.send(simpleMailMessage);
    }

    /**
     * 群发
     *
     * @param recipients 收件人
     * @param subject    主题
     * @param content    内容
     */
    public static void send(List<String> recipients, String subject, String content) {
        simpleMailMessage.setTo(recipients.toArray(new String[recipients.size()]));
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        mailSender.send(simpleMailMessage);
    }
}