public class Enforcement {
    public static void main(String[] args) {
        ProgrammingBook programmingBook1 = new ProgrammingBook("all","non");
        programmingBook1.setBookInfo("THE PRAGMATIC PROGRAMMER: FROM JOURNEYMAN TO MASTER","Andy Hunt",
                75000,1);

        ProgrammingBook programmingBook2 = new ProgrammingBook("all","non");
        programmingBook2.setBookInfo("HEAD FIRST DESIGN PATTERNS: A BRAIN-FRIENDLY GUIDE","Eric Freeman",
                100000,2);

        ProgrammingBook programmingBook3 = new ProgrammingBook("java","non");
        programmingBook3.setBookInfo("Lập trình hướng đối tượng JAVA core dành cho người mới bắt đầu học lập trình",
                "Neos.Thanh",190000,3);

        ProgrammingBook programmingBook4 = new ProgrammingBook("java","non");
        programmingBook4.setBookInfo("Core Java Volume I: Fundamentals","Cay Horstmann",500000,4);

        ProgrammingBook programmingBook5 = new ProgrammingBook("java","non");
        programmingBook5.setBookInfo("Java: The Complete Reference","Herbert Schildt",600000,5);

        System.out.println(programmingBook1.toString());
        System.out.println(programmingBook2.toString());
        System.out.println(programmingBook3.toString());
        System.out.println(programmingBook4.toString());
        System.out.println(programmingBook5.toString());


        FictionBook fictionBook1 = new FictionBook("Tamly");
        fictionBook1.setBookInfo("Kẻ Trộm Giấc Mơ","Yasutaka Tsutsui",110000,6);

        FictionBook fictionBook2 = new FictionBook("XaHoi");
        fictionBook2.setBookInfo("451 độ F","Ray Brabury",70000,7);

        FictionBook fictionBook3 = new FictionBook("TrinhTham");
        fictionBook3.setBookInfo("Sáu đợt thức tỉnh","Mur Lafferty",155000,8);

        FictionBook fictionBook4 = new FictionBook("Phieuluu");
        fictionBook4.setBookInfo("Hai vạn dặm dưới đáy biển","Jules Verne",189000,9);

        FictionBook fictionBook5 = new FictionBook("VienTuong");
        fictionBook5.setBookInfo("I am Robot","Isaac Asimov ",175000,10);

        System.out.println(fictionBook1.toString());
        System.out.println(fictionBook2.toString());
        System.out.println(fictionBook3.toString());
        System.out.println(fictionBook4.toString());
        System.out.println(fictionBook5.toString());

        System.out.println("Total book had added: "+Book.count);
        System.out.println("Total price: "+Book.money);
        System.out.println("Total Programming Book have java language: "+ProgrammingBook.javacount);
    }
}
