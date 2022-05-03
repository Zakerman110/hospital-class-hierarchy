package com.solvd.hospital.Classes;

import org.apache.log4j.Logger;

public class DeadLock {

    private static final Logger LOGGER = Logger.getLogger(DeadLock.class);

    public static void TightBridgeCrossing(Transport car1, Transport car2)
    {
        synchronized(car1)
        {
            LOGGER.info("Car " + car1.getLicenseNumber() + " is crossing the bridge first.");
            synchronized(car2)
            {
                LOGGER.info("Car " + car2.getLicenseNumber() + " is crossing the bridge second.");
            }
        }
    }
}
