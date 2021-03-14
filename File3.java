import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createFile();
        getFileName();
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){

        File file = new File("********************(file path\\new file.tx)*****************");
        try {
            if(file.createNewFile())
            System.out.println("dosya olusturuldu");
            else
            System.out.println("dosya zaten var");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileName(){

        File file = new File("********************(file path\\new file.tx)*****************");

        if(file.exists())
            System.out.println("dosya adı: "+file.getName());
        else
            System.out.println("dosya bulunamadı");
        System.out.println("dosya yolu: "+file.getPath());
        System.out.println("dosya yazılabilir mi? "+file.canWrite());
        System.out.println("dosya okunabilirmi mi? "+file.canRead());
        System.out.println("dosya boyutu ? "+file.length());

    }

    public static void readFile(){
        int i=0,total=0;
        File file = new File("********************(file path\\new file.tx)*****************");
        Scanner reader =null;
        try {
            reader=new Scanner(file);
            while (reader.hasNextLine()){
                i++;
                String line=reader.nextLine();
                System.out.println(i+"'inci satır: "+line);


            }
            System.out.println("total: "+total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
            System.out.println("dosya kapatıldı");
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("********************(file path\\new file.tx)*****************));
            writer.newLine();
            writer.write("zamazingo ");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
