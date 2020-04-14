public class ProgrammingBook extends Book {
    private String language,framework;
    public static int javacount;
    ProgrammingBook(){}
    ProgrammingBook(String language,String framework){
        this.setLanguage(language);
        this.setFramework(framework);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if(language=="java"){
            javacount++;
        }
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
