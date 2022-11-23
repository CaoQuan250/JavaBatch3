package com.example.rabbitmqconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.rabbitmqconsumer.exception.InvalidSalaryException;
import com.example.rabbitmqconsumer.model.Employee;

@Component
public class RabbitMQConsumer {
    private static final Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = "javainuse.queue")
    public void recievedMessage(Employee employee) throws InvalidSalaryException {
        logger.info("Recieved Message From RabbitMQ: " + employee);
        if (employee.getSalary() < 0) {
            throw new InvalidSalaryException();
        }
    }
}
