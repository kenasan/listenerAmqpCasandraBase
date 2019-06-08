package com.intexsoft.javacourse.tsymmerman.services;

import com.intexsoft.javacourse.tsymmerman.constants.AmqpConstants;
import lombok.extern.log4j.Log4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Created by kenasan on 08.06.2019.
 */
@RabbitListener(queues = AmqpConstants.QUEUE_NAME)
@Log4j
public class AmqpListener {

    @RabbitHandler
    public void listener(String messageQueue) {
        log.info("get message: " + messageQueue);
    }
}
