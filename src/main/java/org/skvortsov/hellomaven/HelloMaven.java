package org.skvortsov.hellomaven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMaven {

    private static final Logger logger = LoggerFactory.getLogger(HelloMaven.class);

    public static void main(String[] args) {
        logger.info("Hello Info");
        logger.debug("Hello Debug");
    }
}
