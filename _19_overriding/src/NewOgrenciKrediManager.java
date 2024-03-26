public class NewOgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){ //overriding olduğu için BaseKrediManagerde kullanılmasına rağmen aynı kodu burda kullanarak ezmiş oluyoruz
        return tutar * 1.10;
    }
}
