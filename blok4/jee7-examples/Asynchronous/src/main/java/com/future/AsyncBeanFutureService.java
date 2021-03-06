package com.future;

import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import java.util.concurrent.Future;

@Stateless
public class AsyncBeanFutureService {

    @Asynchronous
    public Future<String> doSomeAsyncThing() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        return new AsyncResult<>("[3] async");
    }

    @Asynchronous
    public Future<String> doAnotherAsyncThing() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        return new AsyncResult<>("[2] another async");
    }
}
