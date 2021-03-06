package com.example.mailtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class Email {


    @Autowired
    private JavaMailSender javaMailSender;

    /*
    Envia un email a "enricplanas2@gmail.com
    */
    void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("enricplanas2@gmail.com");

        msg.setSubject("Snapshot distintas");
        msg.setText("El contenido de la web es distinto");

        javaMailSender.send(msg);


    }
}
