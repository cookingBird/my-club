package com.cookingBird.subject.common.factory;

import com.cookingBird.subject.common.handler.Handler;

public class FactoryUnSupportException extends RuntimeException {

    public static FactoryUnSupportException create() {
        return new FactoryUnSupportException("factory don't support");
    }

    public static FactoryUnSupportException create(Handler handler) {
        return new FactoryUnSupportException(handler.getClass().getName());
    }


    public FactoryUnSupportException() {
    }

    public FactoryUnSupportException(String message) {
        super(message);
    }

    public FactoryUnSupportException(String message, Throwable cause) {
        super(message, cause);
    }

    public FactoryUnSupportException(Throwable cause) {
        super(cause);
    }
}
