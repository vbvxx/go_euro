package Parser;

/**
 * Created by vincentbeauvieux on 26/09/2016.
 */
public class CommandParser {
    public static String Parse(String[] args) throws BadArgumentsException {

        String city = "";
        if(args.length == 0 || args == null) {
            throw new BadArgumentsException("uncorrect arguments");
        }
        if(args.length == 1) {
            city = args[0];
            return city;
        }

        if(args.length > 1) {
            for(String arg : args){
                city = city + arg;
            }
            return city;
        }
        return city;
    }
}
