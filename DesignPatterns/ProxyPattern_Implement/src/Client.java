import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String url;
        String filePath;
        System.out.println("Enter your URL:");
        System.out.println("Enter your destination filepath:");
        url=scn.next();
        filePath = scn.next();
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(url,filePath);
    }
}
