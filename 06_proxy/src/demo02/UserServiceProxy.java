package demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        beforeMessage("add");
        System.out.println("add user");
    }

    @Override
    public void delete() {
        beforeMessage("delete");
        System.out.println("delete user");
    }

    @Override
    public void update() {
        beforeMessage("update");
        System.out.println("update user");
    }

    @Override
    public void query() {
        beforeMessage("query");
        System.out.println("query user");
    }

    public void beforeMessage(String message) {
        System.out.println("Debug " + message + " Info.");
    }

}
