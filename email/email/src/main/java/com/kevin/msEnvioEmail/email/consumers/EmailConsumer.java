package com.kevin.msEnvioEmail.email.consumers;

import com.kevin.msEnvioEmail.email.dtos.EmailRecordDto;
import com.kevin.msEnvioEmail.email.models.EmailModel;
import com.kevin.msEnvioEmail.email.services.EmailServices;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    final EmailServices emailServices;

    public EmailConsumer(EmailServices emailServices){
        this.emailServices = emailServices;
    }

    @RabbitListener(queues = "default.email")
    public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto){
        System.out.println(emailRecordDto.emailTo());

        var emailModel = new EmailModel();
        BeanUtils.copyProperties(emailRecordDto, emailModel);
        emailServices.sendEmail(emailModel);

    }


}
