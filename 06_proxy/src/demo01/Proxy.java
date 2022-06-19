package demo01;

public class Proxy implements Rent {

    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse() {
        System.out.println("see house");
    }

    public void fare() {
        System.out.println("fare");
    }

    public void sign() {
        System.out.println("sign");
    }

}
