public class SoyutSiniflar {
    public static void main(String[] args) {
        Ders.Matematik matematikDersi = new Ders.Matematik("Matematik", "10/A");
        Ders.Fizik fizikDersi = new Ders.Fizik("Fizik", "11/B");
        Ders.Kimya kimyaDersi = new Ders.Kimya("Kimya", "9/C");

        matematikDersi.IsmiBuyut(matematikDersi.DersAd);
        System.out.println(matematikDersi.IsimGetir());
        System.out.println(matematikDersi.SinifGetir());
        matematikDersi.SozluSunum();
        matematikDersi.YaziliSunum();
        System.out.println();

        fizikDersi.IsmiBuyut(fizikDersi.DersAd);
        System.out.println(fizikDersi.IsimGetir());
        System.out.println(fizikDersi.SinifGetir());
        fizikDersi.SozluSunum();
        fizikDersi.YaziliSunum();
        System.out.println();

        kimyaDersi.IsmiBuyut(kimyaDersi.DersAd);
        System.out.println(kimyaDersi.IsimGetir());
        System.out.println(kimyaDersi.SinifGetir());
        kimyaDersi.SozluSunum();
        kimyaDersi.YaziliSunum();
    }
}