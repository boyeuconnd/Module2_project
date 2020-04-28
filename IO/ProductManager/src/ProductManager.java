import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProductManager {
    protected static void showProductList(File list){
        String line = "";
        String[] splited;
        final String TEXT_CUT = ",";
            try(BufferedReader buffRead = new BufferedReader(new FileReader(list))) {

                System.out.println("====Product list====");
                while ((line = buffRead.readLine()) != null) {
                    splited=line.split(TEXT_CUT);
                    System.out.println("Code: "+splited[0]+", Name: "+splited[1]+
                            ", Brand: "+splited[2]+", Price: " +
                            splited[3]+", Description: "+splited[4]);

                }

            } catch (IOException e){
                e.printStackTrace();
            }

    }
    protected static void findProductByName(File list, String keyword){
        String line ="";
        String[] splited;
        final String TEXT_CUT = ",";
        try (BufferedReader buffRead = new BufferedReader(new FileReader(list))){
            while ((line = buffRead.readLine()) != null){
                splited=line.split(TEXT_CUT);
                if(splited[1].equalsIgnoreCase(keyword)){
                    System.out.println("Product Found:");
                    System.out.println("Code: "+splited[0]+", Name: "+splited[1]+
                            ", Brand: "+splited[2]+", Price: " +
                            splited[3]+", Description: "+splited[4]);
                    return;

                }

            }
            System.out.println("Product not found.");

        } catch (IOException e){
            e.printStackTrace();
        }

    }
    protected static boolean deleteProductByName(File list,String keyword){
        String tempLine = "";
        String[] splited;
        final String TEXT_CUT = ",";
        boolean result =false;
        Queue<String> line = new LinkedList<>();
        try{
            BufferedReader buffRead = new BufferedReader(new FileReader(list));
            while ((tempLine = buffRead.readLine())!= null){
                splited = tempLine.split(TEXT_CUT);
                if(splited[1].equalsIgnoreCase(keyword)){
                    result = true;
                    continue;
                }else {
                    line.add(tempLine);
                }
            }

            buffRead.close();
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(list));
            while (!line.isEmpty()){
                buffWrite.write(line.poll()+"\n");
            }
            buffWrite.close();


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            return result;
        }
    }
    protected static void addProduct(File list,String code,String name,String brand,int price, String description){
        Queue<String> line = new LinkedList<>();
        String temp ="";
        try{
            BufferedReader buffRead = new BufferedReader(new FileReader(list));
            while ((temp = buffRead.readLine()) != null){
                line.add(temp);
            }
            buffRead.close();
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(list));
            while (!line.isEmpty()){
                buffWrite.write(line.poll()+"\n");
            }
            buffWrite.write(code+","+name+","+brand+","+price+","+description);
            buffWrite.flush();
            buffWrite.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        File productList = new File("D:\\CodeGym\\FilePath\\Product\\ProductList.txt");
        Scanner scn = new Scanner(System.in);
        try {
            if (!productList.exists()) {
                throw new FileNotFoundException("File not found");
            }else {
                showProductList(productList);
//                System.out.print("Enter search name: ");
//                String searchValue = scn.nextLine();
//                findProductByName(productList,searchValue);
                addProduct(productList,"007","Ertiga","Suzuki",20000,"MPV car 7 seats");
                System.out.println("after add=======================");
                showProductList(productList);
                deleteProductByName(productList,"Civic");
                System.out.println("After delete==================");
                showProductList(productList);

            }

        }catch (FileNotFoundException r){
            System.err.println("File input error: "+r.getMessage());
        }

    }

}
