package Creational.Builder;

import Creational.Builder.CountryBuilders.Farmer;
import Creational.Builder.CountryBuilders.Minister;
import Creational.Builder.CountryBuilders.Soldier;
import Creational.Builder.CountryBuilders.Worker;

public class Main {
    public static void main(String[] args) {
        CountryBuilder builder = new CountryBuilder();
        builder.build(new Farmer())
                .build(new Minister())
                .build(new Soldier())
                .build(new Worker());
    }
}
