package com.example.producer.service.producer;

@SpringBootApplication
public class ProducerApplication {

    private static final Logger logger = LoggerFactory.getLogger(ProducerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
        logger.info("Running...");
    }

}