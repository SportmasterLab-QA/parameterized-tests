package ru.sportmaster.parameterized.tests;

import java.util.Date;

public class Ware {
    public String name;
    public Date productionDate;
    public int daysOfShelfLife;

    public Ware(String name, Date productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }
}
