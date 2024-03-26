public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers=new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()}; //baselogger anne görevi gördüğü için hepsinden miras alıyor.Yeni classlarda eklenebilir ve silinebilir
//        for(BaseLogger logger:loggers)
//            logger.log("Log mesajı");
//        }
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());//DatabaseLogger yerine diğer classlarda kullanılabilir böylelikle nerde müşteri eklediysek kolaylık sadece burda değiştirerek halolur.
        customerManager.add();
    }

    }