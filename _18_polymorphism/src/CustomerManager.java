public class CustomerManager extends BaseLogger{
    private BaseLogger logger; //anneyi private ettiğimiz için tüm classları mainde çekebiliriz
    public CustomerManager(BaseLogger logger){ //BaseLogger a bağlı tüm classların refansını tutuyor
        this.logger=logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı ");
    }
}
