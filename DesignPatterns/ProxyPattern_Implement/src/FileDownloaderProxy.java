public class FileDownloaderProxy implements Downloader {
    final String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36 Edg/81.0.416.72";
    FileDownloader fileDownloader = new FileDownloader(userAgent);
    @Override
    public void download(String url, String destination) {
        fileDownloader.download(url,destination);

    }
}
