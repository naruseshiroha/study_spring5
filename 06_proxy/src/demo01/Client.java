package demo01;

public class Client {
   public static void main(String[] args) {
    //    Host host = new Host();
    //    host.rent();

    Host host = new Host();
    // proxy
    Proxy proxy = new Proxy(host);
    proxy.rent();
   } 
}
