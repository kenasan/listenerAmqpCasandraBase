package com.intexsoft.javacourse.tsymmerman;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kenasan on 06.06.2019.
 */
@SpringBootApplication
@Log4j
public class Main {

    public static void main(String[] args) {
        try {
            SpringApplication.run(Main.class, args);
        } catch (Exception e) {
//            log.error(e);
        }
    }
}