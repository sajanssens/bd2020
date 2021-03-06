package com.example.cdi.observer.nieuwsbrief;

import org.slf4j.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class Bedrijf {

    // See GreeterSimple for event throwing

    @Inject Logger log;

    public void onNieuwsbrief(@Observes Nieuwsbrief n) {
        log.info("Nieuwe nieuwsbrief ontvangen! Inhoud: " + n.inhoud);
    }

}
