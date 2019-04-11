package com.vilin.springmvc.chapter13.unit.spy;

import com.vilin.springmvc.chapter13.unit.MyUtility;
import com.vilin.springmvc.chapter13.unit.dao.GarageDAO;

public class GarageDAOSpy implements GarageDAO {
    private int carCount = 3;
    
    @Override
    public MyUtility rent() {
        if (carCount == 0) {
            return null;
        } else {
            carCount--;
            return new MyUtility();
        }   
    }
}
