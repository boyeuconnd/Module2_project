public class FictionBook extends Book {
    private String catelogy;
    FictionBook(){}
    FictionBook(String catelogy){
        this.setCatelogy(catelogy);
    }

    public String getCatelogy() {
        return catelogy;
    }

    public void setCatelogy(String catelogy) {
        this.catelogy = catelogy;
    }
}
