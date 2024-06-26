package com.learn.java.logging.core;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLog() {
        System.out.println("Hello Logger,");
        log.info("Hello Logger.");

        System.out.println("Halo Logging.");
        log.info("Halo Logging.");
    }

    @Test
    void testLevel() {
        log.trace("Trace");
        log.debug("Debug");
        log.info("Info");
        log.warn("Warning");
        log.error("Error");
    }

    @Test
    void testLogFormat() {
        log.info("Without Parameter");
        log.info("{} + {} = {}", 10, 10, (10 + 10));
        log.error("Ups", new NullPointerException());
    }
}
