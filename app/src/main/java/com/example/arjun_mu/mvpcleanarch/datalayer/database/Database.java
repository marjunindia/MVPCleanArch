package com.example.arjun_mu.mvpcleanarch.datalayer.database;

import com.example.arjun_mu.mvpcleanarch.model.Cheese;
import com.example.arjun_mu.mvpcleanarch.model.Fruit;
import com.example.arjun_mu.mvpcleanarch.model.Sweet;

public interface Database {

    Fruit getFruitById(int id);
    Cheese getCheeseById(int id);
    Sweet getSweetById(int id);

}
