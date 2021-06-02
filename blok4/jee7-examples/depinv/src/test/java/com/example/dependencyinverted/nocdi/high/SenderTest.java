package com.example.dependencyinverted.nocdi.high;

import com.example.dependencyinverted.nocdi.high.Sender;
import com.example.dependencyinverted.nocdi.low.Email;
import com.example.dependencyinverted.nocdi.low.Sms;
import org.junit.jupiter.api.Test;

import static com.example.dependencyinverted.cdi.util.Values.OK;
import static org.assertj.core.api.Assertions.assertThat;

class SenderTest {
    Sender target = new Sender();

    @Test
    void sendAll() {
        // given

        // dependency injection -------------------
        // (DYDI (Do-it-Yourself Dependency Injection))
        // https://www.baeldung.com/java-ee-cdi#dydi-do-it-yourself-dependency-injection
        target.addSendable(new Email());
        target.addSendable(new Sms());

        // when
        String s = target.sendAll();

        // then
        assertThat(s).contains(OK);
    }

    @Test
    void send() {
        // given
        target = new Sender(new Email());
        // dependency injection -------------------
        // (DYDI (Do-it-Yourself Dependency Injection))
        // https://www.baeldung.com/java-ee-cdi#dydi-do-it-yourself-dependency-injection

        // when
        String s = target.send(Email.class);

        // then
        assertThat(s).contains(OK);
    }
}
