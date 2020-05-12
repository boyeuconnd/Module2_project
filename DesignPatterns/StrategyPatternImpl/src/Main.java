public class Main {
    public static void main(String[] args) {
        User user1 = new UserController(new XMLStorage());
        user1.store();
        User user2 = new UserController(new MySQLStorage());
        user2.store();
    }



}
