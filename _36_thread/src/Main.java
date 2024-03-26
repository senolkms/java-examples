//  Her bir thread, bağımsız olarak çalışan bir iş parçacığıdır. Diğer threadlerin çalışması üzerinde doğrudan etkisi yoktur.
//Birden fazla thread aynı anda çalışabilir. Bu, iş parçacıklarının örtüşmesi anlamına gelir ve işlemlerin hızlandırılmasına yardımcı olabilir.
public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start(); // Thread 1'i başlat
        thread2.start(); // Thread 2'yi başlat
    }
}