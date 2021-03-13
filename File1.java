import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int total=0;
        String line=null;
        BufferedReader reader= null;


        try {
             reader= new BufferedReader(new FileReader("***************copy path(number)*************"));

             while ((line = reader.readLine()) != null){

                 total+=Integer.valueOf(line);
                 System.out.println(line);

             }
            System.out.println("total :"+total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
                try {
                    reader.close();
                }
                catch (Exception exception){

                }
        }
    }
}
