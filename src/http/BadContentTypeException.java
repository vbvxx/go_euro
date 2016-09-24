package http;

/**
 * Created by vincentbeauvieux on 24/09/2016.
 */
public class BadContentTypeException extends Exception{
    public BadContentTypeException(String message){
        super(message);
    }
}
