// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] sehirler= new String[3][3];
        sehirler[0][0]="İstanbul ";
        sehirler[0][1]="Bursa ";
        sehirler[0][2]="Tekirdağ ";
        sehirler[1][0]="Trabzon ";
        sehirler[1][1]="Giresun ";
        sehirler[1][2]="Rize ";
        sehirler[2][0]="Antalya ";
        sehirler[2][1]="Mersin ";
        sehirler[2][2]="Hatay ";
        int i,j;
        for(i=0;i<3;i++){
            System.out.println("--------");
            for(j=0;j<3;j++){
                System.out.println(sehirler[i][j]);

            }
        }

    }
}