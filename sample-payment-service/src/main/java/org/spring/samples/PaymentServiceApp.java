package org.spring.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class to start the payment service application.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
@SpringBootApplication
public class PaymentServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApp.class, args);
    }

}
