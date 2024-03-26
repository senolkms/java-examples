import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //createFile();
        readFile();
        writeFile();
        getFileInfo();
    }

    public static void  createFile(){
        File file =new File("C:\\Users\\senol\\Desktop\\JAVA\\_34_files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  getFileInfo(){
        File file =new File("C:\\Users\\senol\\Desktop\\JAVA\\_34_files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya boyutu (byte) : " + file.length());
        }
    }

    public static void readFile(){
        File file =new File("C:\\Users\\senol\\Desktop\\JAVA\\_34_files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){ //okunacak satır kadar
                String line = reader.nextLine(); //sonraki satır kadar / satır okuyabildiği kadar
                System.out.println(line);
            }
            reader.close();//dosyayı işlem bitince kapatıyoruz
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\senol\\Desktop\\JAVA\\_34_files\\students.txt",true));//sondaki true dosyanın üzerine değilde dosyaya veri eklemek için kullanılır
            writer.newLine();//yeni satır
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
