public class MySQLStorage implements UserStorage {
    @Override
    public void store() {
        System.out.println("Exported a SQL file.");
    }
}
