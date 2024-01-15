/*
 * This class prints the given message on console.
 */
public class MessageUtil {

    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    // prints the message
    public void printMessage() throws InterruptedException{
        System.out.println(message);
        int a = 0;
        int b = 10;
        int c = b / a;
        Thread.sleep(3000);
        System.out.println(c);

    }
}
