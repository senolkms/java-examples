public class CustomerManager {
    BaseDatabaseManager databaseManager; //stratejimiz görevi görüyor
    public void getCustomers(){
        databaseManager.getData(); //hangi databaseyi verirsek onun getDatası çalışır
    }
}
