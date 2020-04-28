import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class BinaryCopy {
    private static void copyFileBinary(File source, File destination)throws IOException {
        final int BUFFER_SIZE = 16384; // 16KB buffer size
        try (InputStream inputStr = new BufferedInputStream(new FileInputStream(source),BUFFER_SIZE);
              OutputStream outputStr = new BufferedOutputStream(new FileOutputStream(destination),BUFFER_SIZE))   {
            byte[] buffer = new byte[BUFFER_SIZE];
            while (inputStr.read(buffer)!= -1){
                outputStr.write(buffer);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the source path: ");
        String sourcePath = scn.nextLine();
        System.out.print("Enter the destination path");
        String destPath = scn.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try { //Check source file and destination file valid
            if (!sourceFile.exists()) {
                throw new FileNotFoundException("File not found.");
            }else if(destFile.exists()){
                throw new FileAlreadyExistsException("File already exist.");
            }else {
                try { //Proceed copy file
                    copyFileBinary(sourceFile, destFile);

                    System.out.println("Copy completed");
                } catch (IOException ioe) {
                    System.out.println("Can't copy that file");
                    System.out.println(ioe.getMessage());
                }
            }
        }catch (FileNotFoundException e) {
            System.err.println("File source error: "+e.getMessage());
        }catch (FileAlreadyExistsException ex){
            System.err.println("File destination error: "+ex.getMessage());
        }




    }
}
