
public class MySqlCustomerDal implements ICustomerDal, IRepository{ //Interface birden fazla implement alabilir
    @Override
    public void Add() {
        System.out.println("My sql eklendi");
    }
}
