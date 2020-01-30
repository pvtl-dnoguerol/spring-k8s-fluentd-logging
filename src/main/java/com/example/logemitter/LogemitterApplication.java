package com.example.logemitter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Random;

@SpringBootApplication
@EnableScheduling
public class LogemitterApplication {
	private static final Logger logger = LoggerFactory.getLogger(LogemitterApplication.class.getName());

	private final Random random = new Random();

	@Scheduled(fixedDelay = 1000)
	public void log() {
		switch (random.nextInt(5)) {
			case 0:
				logger.info("Info message");
				break;
			case 1:
				logger.debug("Debug message");
				break;
			case 2:
				logger.trace("Trace message");
				break;
			case 3:
				logger.error("Error message");
				break;
			case 4:
				logger.warn("Warning message");
				break;
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(LogemitterApplication.class, args);
	}

}
