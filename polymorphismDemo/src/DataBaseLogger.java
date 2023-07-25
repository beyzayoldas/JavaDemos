public class DataBaseLogger extends BaseLogger{
    //overriding:üstüne yazma
    public void log(String message){
        System.out.println("logged to database:"+message);
    }
}
