import java.util.*;

public class ProductManager extends Product{
    Scanner scn = new Scanner(System.in);
    public static ArrayList<Product> productList = new ArrayList<Product>();
    public static void add(String code,String name, int price){
        Product newProduct;
        newProduct = new Product(code,name,price);
        productList.add(newProduct);
    }
    public static void showProductList(){
        for (Product item : productList){
            System.out.printf("Code: %3s; Name: %10s ; Price: %7d \n",item.getCode(),item.getName(),item.getPrice());
        }
    }
    public static void editProDuct(String code,String newName,int newPrice){
        Product newProduct = new Product(code,newName,newPrice);
        if(isContain(code)){
            int index = productList.indexOf(getProductByCode(code));
            productList.remove(index);
            productList.add(index,newProduct);
        }else {
            throw new RuntimeException("Không có sản phẩm");
        }

    }
    static boolean isContain(String code){
        for(Product item:productList){
            if(item.getCode().equals(code)){
                return true;
            }
        }
        return false;
    }
    static Product getProductByCode(String code){
        for(Product element:productList){
            if(element.getCode().equals(code)){
                return element;
            }
        }
        throw new RuntimeException("Valid code");
    }
    static void searchByName(String name){
        String result ="";
        for(Product element:productList){
            if(element.getName().equals(name)){
                System.out.print("Product founded: ");
                result += "Code:"+element.getCode()+"; Name: "+element.getName()+"; Price: "+element.getPrice();
                break;
            }
        }
        if(result!="") System.out.println(result);
        else System.out.println("Product not found");
    }
    static void remove(String code){
        int count =0;
        for(Product element:productList){
            if(element.getCode().equals(code)){
                count++;
                productList.remove(element);
                break;
            }
        }
        if(count ==0) System.out.println("Product not found");
        else System.out.println("Product have deleted");

    }
//    static <K,V extends Comparable<? super V>>
//    SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
//        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
//                new Comparator<Map.Entry<K,V>>() {
//                    @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
//                        int res = e1.getValue().compareTo(e2.getValue());
//                        return res != 0 ? res : 1;
//                    }
//                }
//        );
//        sortedEntries.addAll(map.entrySet());
//        return sortedEntries;
//    }
    static void sortIncreasing(){
        Map<Integer,Product> lists = new TreeMap<Integer,Product>();
        for (Product element:productList) {
            lists.put(element.getPrice(),element);
        }
        Set<Integer> keys = lists.keySet();
        for (Integer key: keys){
            System.out.println("Price: " + key + ": Name: " + lists.get(key).getName()+"; Code: "+lists.get(key).getCode());
        }

    }
    static void sortDecreasing(){
        TreeMap<Integer,Product> lists = new TreeMap<Integer, Product>();
        for (Product element:productList) {
            lists.put(element.getPrice(),element);
        }
        NavigableMap revertMap = lists.descendingMap();
        Set<Integer> keys = revertMap.keySet();
        for (Integer key: keys){
            System.out.println("Price: " + key + ": Name: " + lists.get(key).getName()+"; Code: "+lists.get(key).getCode());
        }
    }
//    public String toString(Product element){
//        return "Code: "+ element.getCode()
//                +"; Name: "+element.getName()
//                +"; Price: "+element.getPrice();
//
//    }

}


