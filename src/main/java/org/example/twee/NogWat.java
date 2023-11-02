package org.example.twee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NogWat {

    Logger slf4j = LoggerFactory.getLogger(NogWat.class);

    // ...

    public void doeWat() {
        slf4j.info("Ik doe wat....");
        slf4j.debug("Ik doe wat debuggen....");
        slf4j.warn("Ik doe wat waarschuwen....");
    }
}
