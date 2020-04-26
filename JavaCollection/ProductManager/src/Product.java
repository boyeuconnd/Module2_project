public class Product {
    private String name;

    private String code;

    private int price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public Product(){}
    public Product(String code,String name, int price){
        this.code = code;
        this.name = name;
        this.price = price;
    }


}
