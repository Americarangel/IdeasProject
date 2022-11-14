public class JerException extends Exception{

    private int errorCode;

    public JerException(int reason) {
        errorCode = reason;
    }

    public String toString() {
        return "JerException Error Code "+errorCode;
    }

}
