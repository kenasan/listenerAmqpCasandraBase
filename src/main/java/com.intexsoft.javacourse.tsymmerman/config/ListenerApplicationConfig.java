package com.intexsoft.javacourse.tsymmerman.config;

import com.intexsoft.javacourse.tsymmerman.services.AmqpListener;
import lombok.extern.log4j.Log4j;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring create bean of writing there classes.
 */
@Log4j
@Configuration
public class ListenerApplicationConfig {

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory =
                new CachingConnectionFactory("localhost");
        return connectionFactory;
    }

    @Bean
    public AmqpListener amqpListener() {
        return new AmqpListener();
    }
}