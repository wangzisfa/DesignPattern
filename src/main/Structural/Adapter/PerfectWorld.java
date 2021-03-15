package Structural.Adapter;

public class PerfectWorld extends SteamChina implements Steam {

    @Override
    public String playHorizon() {
        return this.playHorizonOffline();
    }
}
