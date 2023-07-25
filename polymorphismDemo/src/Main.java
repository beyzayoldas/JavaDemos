
public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers=new BaseLogger[]{new DataBaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
//        for(BaseLogger logger:loggers){
//            logger.Log("ortak mesaj");
//        }


        CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
        CustomerManager customerManager2=new CustomerManager(new FileLogger());

        customerManager.add();
        customerManager2.add();
    }
}