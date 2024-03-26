public class HesapMakinesi implements Hesaplama{
    @Override
    public int toplama(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    @Override
    public int cikarma(int sayi1,int sayi2){
        return sayi1-sayi2;
    }
}
