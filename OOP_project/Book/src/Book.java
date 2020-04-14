public class Book {
    public static int count,money;
    private String name, author;
    private int price;
    private long bookCode;
    Book(){
        count++;
    }
    Book(String name, String author, int price, long bookCode){
        this.name = name;
        this.author = author;
        this.price = price;
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        money+=this.price;
    }

    public long getBookCode() {
        return bookCode;
    }

    public void setBookCode(long bookCode) {
        this.bookCode = bookCode;
    }
    public void setBookInfo(String name,String author,int price,long bookCode){
        this.setName(name);
        this.setAuthor(author);
        this.setPrice(price);
        this.setBookCode(bookCode);
    }
    @Override
    public String  toString(){
        return "The book:"+this.name
                +" author:"+this.author
                +" price:"+this.price
                +" bookCode:"+this.bookCode;

    }
}
