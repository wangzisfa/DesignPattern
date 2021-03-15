package Structural.Adapter;


/*
* 解决接口之间不匹配\不兼容的问题
*
* */

public class Main {
    public static void main(String[] args) {
        Steam steam = new PerfectWorld();
        System.out.println(steam.playHorizon());
        Steam spain = new SteamSpain();
        System.out.println(spain.playHorizon());
    }
}
