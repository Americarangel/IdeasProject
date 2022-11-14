public class AmeException extends Exception{
    private int errorCode;

    public AmeException(int reason) {
        errorCode = reason;
    }

    public String toString() {
        return "AmeException Error Code "+errorCode;
    }
}
