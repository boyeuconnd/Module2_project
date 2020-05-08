public class Client {
    public void share(String message){
        SocialShareFacade shareTools = new SocialShareFacade(new Twitter(), new Facebook(), new LinkedIn());
        shareTools.share(message);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }
}
