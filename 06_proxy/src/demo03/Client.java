package demo03;

import demo02.UserService;
import demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // target
        UserServiceImpl userService = new UserServiceImpl();

        // proxy
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();

    }
}
