import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "D:\\CodeGym\\FilePath\\Country.csv";
        BufferedReader buff = null;
        String line ="";
        String csvSplited =",";
        try{
            buff = new BufferedReader(new FileReader(csvFile));
            while ((line=buff.readLine())!=null){
                String[] country = line.split(csvSplited);
                System.out.println("Code: "+country[4]+", Name: "+country[5]);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found:");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (buff != null){
                try{
                    buff.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
