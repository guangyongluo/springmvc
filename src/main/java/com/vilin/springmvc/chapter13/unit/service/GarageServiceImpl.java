package com.vilin.springmvc.chapter13.unit.service;

import com.vilin.springmvc.chapter13.unit.MyUtility;
import com.vilin.springmvc.chapter13.unit.dao.GarageDAO;

public class GarageServiceImpl implements GarageService {
    private GarageDAO garageDAO;
    public GarageServiceImpl(GarageDAO garageDAOArg) {
        this.garageDAO = garageDAOArg;
    }
    public MyUtility rent() {
        return garageDAO.rent();
    }
}
