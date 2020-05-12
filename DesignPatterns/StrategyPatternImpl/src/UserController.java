public class UserController extends User {
    private UserStorage userStorage;
    public UserController(UserStorage userStorage) {
        this.userStorage=userStorage;
    }
    public void store(){
        userStorage.store();
    }
}
