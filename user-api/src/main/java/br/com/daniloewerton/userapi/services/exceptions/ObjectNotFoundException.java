package br.com.daniloewerton.userapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
