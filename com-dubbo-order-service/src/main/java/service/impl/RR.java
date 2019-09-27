package service.impl;

import org.apache.log4j.Logger;

public class RR {

    private static Logger logger = Logger.getLogger(RR.class);
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            RR.logger.debug("debug信息");
            RR.logger.info("普通的info信息");
            RR.logger.error("error信息");
            RR.logger.warn("warn信息");
            RR.logger.fatal("fatal信息");
        }
    }
}
