package Creational.Builder;

import Creational.Builder.CountryBuilders.Farmer;
import Creational.Builder.CountryBuilders.Minister;
import Creational.Builder.CountryBuilders.Soldier;
import Creational.Builder.CountryBuilders.Worker;

public class CountryBuilder {
    private Farmer farmer;
    private Minister minister;
    private Soldier soldier;
    private Worker worker;

    public CountryBuilder build(Farmer farmer) {
        this.farmer = farmer;
        return this;
    }

    public CountryBuilder build(Minister minister) {
        this.minister = minister;
        return this;
    }

    public CountryBuilder build(Soldier soldier) {
        this.soldier = soldier;
        return this;
    }

    public CountryBuilder build(Worker worker) {
        this.worker = worker;
        return this;
    }

    @Override
    public String toString() {
        return "CountryBuilder{" +
                "farmer=" + farmer +
                ", minister=" + minister +
                ", soldier=" + soldier +
                ", worker=" + worker +
                '}';
    }
}
