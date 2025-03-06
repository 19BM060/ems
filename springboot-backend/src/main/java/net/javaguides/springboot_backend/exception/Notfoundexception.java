package net.javaguides.springboot_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class Notfoundexception extends RuntimeException{
    public Notfoundexception(String message)

}
