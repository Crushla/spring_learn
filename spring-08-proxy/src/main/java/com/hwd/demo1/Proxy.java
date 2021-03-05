package com.hwd.demo1;

public class Proxy {
    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    public void hetong() {
        System.out.println("签租赁合同");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}


