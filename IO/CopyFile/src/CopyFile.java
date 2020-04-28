import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File in = null;
        File out = null;
        int charCount =0;
        try {
            in = new File("D:\\CodeGym\\Filepath\\input.txt");
            out = new File("D:\\CodeGym\\Filepath\\output.txt");
            if(!in.exists()) throw new FileNotFoundException("File not found");
            BufferedReader buffRead = new BufferedReader(new FileReader(in));
            if(out.exists()) throw new FileAlreadyExistsException("File output already exist");
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(out));

            String line = "";

            while ((line = buffRead.readLine()) != null) {
                charCount+= line.length();
                buffWrite.write(line+"\n");
            }
            buffWrite.write("Total character in file: "+charCount);
            buffWrite.flush();
            buffRead.close();
            buffWrite.close();

        } catch (FileNotFoundException e) {
            System.err.println("File input error: "+e.getMessage());
        }catch (FileAlreadyExistsException e){
            System.err.println("File output error: "+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Total characters in file: "+charCount);
        }
    }
}
