package com.example.arjun_mu.mvpcleanarch.domainlayer;

import com.example.arjun_mu.mvpcleanarch.datalayer.dao.CheesesDao;
import com.example.arjun_mu.mvpcleanarch.datalayer.dao.CheesesDaoImpl;
import com.example.arjun_mu.mvpcleanarch.model.Cheese;

import java.util.Random;

public class CheeseBeanImpl implements CheeseBean {

    private CheesesDao dao;

    public CheeseBeanImpl(){
        dao=new CheesesDaoImpl();
    }
    @Override
    public Cheese getRandomCheese() {
        int id = new Random().nextInt(14);
        return dao.getCheeseByid(id);
    }
}
