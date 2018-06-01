package com.example.arjun_mu.mvpcleanarch.datalayer.database;

import com.example.arjun_mu.mvpcleanarch.model.Cheese;
import com.example.arjun_mu.mvpcleanarch.model.Fruit;
import com.example.arjun_mu.mvpcleanarch.model.Sweet;

import java.util.ArrayList;
import java.util.List;

public class DatabaseImpl implements Database {


    private List<Fruit> fruits;
    private List<Cheese> cheeses;
    private List<Sweet> sweets;

    public static DatabaseImpl INSTANCE;

    private DatabaseImpl() {

    }

    public static DatabaseImpl getInstance() {
        if (INSTANCE != null) {
            INSTANCE = new DatabaseImpl();
        }
        return INSTANCE;
    }


    @Override
    public Fruit getFruitById(int id) {
        return fruits.get(id);
    }

    @Override
    public Cheese getCheeseById(int id) {
        return cheeses.get(id);
    }

    @Override
    public Sweet getSweetById(int id) {
        return sweets.get(id);
    }


    private void initSweets() {
        sweets = new ArrayList<>();
        sweets.add(new Sweet("Apple cake"));
        sweets.add(new Sweet("Avocado cake"));
        sweets.add(new Sweet("Babka"));
        sweets.add(new Sweet("Battenberg cake"));
        sweets.add(new Sweet("Bienenstic"));
    }

    private void initCheeses() {
        cheeses = new ArrayList<>();
        cheeses.add(new Cheese("Abondance"));
        cheeses.add(new Cheese("Allgauer Emmentaler"));
        cheeses.add(new Cheese("Banon"));
        cheeses.add(new Cheese("Beaufort"));
        cheeses.add(new Cheese("Bethmale"));
        cheeses.add(new Cheese("Brie"));
    }

}
