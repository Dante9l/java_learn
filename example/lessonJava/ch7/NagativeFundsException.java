package lessonJava.ch7;

public class NagativeFundsException extends RuntimeException{
    public NagativeFundsException(String mesg){
        super(mesg);
    }
}
class InsufficentException extends RuntimeException{
    public InsufficentException(String mesg){
        super(mesg);
    }
}
