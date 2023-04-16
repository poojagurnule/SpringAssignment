package com.geekster.WeeklyTest3.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@AllArgsConstructor
@NoArgsConstructor
public class HandleMail {
    @Autowired
    Student s1;
    //    It will search the object of Student in IOC Containers
    public void sendMail() {


        String host = "smtp.gmail.com";

        Properties prop = System.getProperties();
        System.out.println(prop);

        prop.put("mail.smtp.host" , host);
        prop.put("mail.smtp.port" , "465");
        prop.put("mail.smtp.ssl.enable" , "true");
        prop.put("mail.smtp.auth" , "true");
//        Creating session
        Session session = Session.getInstance(prop, new MailAuthenticator()) ;
//        Create the message object
        MimeMessage mimeMessage = new MimeMessage(session);

        try {
            mimeMessage.setFrom(MailConstants.SENDER);
//            To single receipient
            mimeMessage.setRecipient(Message.RecipientType.TO , new InternetAddress(MailConstants.RECEIVER));
            mimeMessage.setSubject(MailConstants.SUBJECT);

            mimeMessage.setText(s1.toString());
            Transport.send(mimeMessage);
        } catch (MessagingException e) {
            System.out.println("Error");
        }
    }
}
