public class Main extends ProductManager {
    public static void main(String[] args) {
        add("001","product1",24000);
        add("002","product2",45000);
        add("003","product3",90000);
        add("004","product4",200000);
        add("005","product5",20000);
        add("006","product6",670000);
        showProductList();
        searchByName("product3");
        remove("009");
        System.out.println("IncreasingSort");
        sortIncreasing();
        System.out.println("DecreasingSort");
        sortDecreasing();

    }
}
