package org.example.een;

import org.example.twee.NogWat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    // Logger log = LoggerFactory.getLogger("LoggingDemo");
    static Logger slf4j = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        slf4j.info("Starting application...");

        // ...
        slf4j.error("Error!"); // wordt altijd getoond, maar je hoopt van niet...

        slf4j.trace("Aanroep x!");  // heel veel logging, voor de diepe nerd
        slf4j.debug("Debug!"); // veel logging voor ontwikkelaar
        slf4j.warn("Warning!"); // logging, voor helpdesk of ontwikkelaar
        slf4j.info("App is gestart."); // weinig logging, voor helpdesk

        NogWat nw = new NogWat();
        nw.doeWat();

        // ...
        // ...
        // ...
        // ...

        slf4j.info("Afsluiten...");
    }
}
