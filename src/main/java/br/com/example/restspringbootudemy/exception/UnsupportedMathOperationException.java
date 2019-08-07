package br.com.example.restspringbootudemy.exception;

public class UnsupportedMathOperationException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UnsupportedMathOperationException(String message) {
        super(message);
    }
}
