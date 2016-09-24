package http;

/**
 * Created by vincentbeauvieux on 24/09/2016.
 */
public class MalformatedURIException extends Exception {
    public MalformatedURIException(String message){
        super(message);
    }
}
