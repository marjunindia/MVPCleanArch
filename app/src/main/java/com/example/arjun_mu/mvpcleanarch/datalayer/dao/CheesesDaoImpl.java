package com.example.arjun_mu.mvpcleanarch.datalayer.dao;

import com.example.arjun_mu.mvpcleanarch.datalayer.database.Database;
import com.example.arjun_mu.mvpcleanarch.datalayer.database.DatabaseImpl;
import com.example.arjun_mu.mvpcleanarch.model.Cheese;

public class CheesesDaoImpl implements CheesesDao {

    Database mDatabase= DatabaseImpl.getInstance();

    @Override
    public Cheese getCheeseByid(int id) {
        return mDatabase.getCheeseById(id);
    }
}
