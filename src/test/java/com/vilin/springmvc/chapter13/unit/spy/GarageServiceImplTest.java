package com.vilin.springmvc.chapter13.unit.spy;

import com.vilin.springmvc.chapter13.unit.MyUtility;
import com.vilin.springmvc.chapter13.unit.dao.GarageDAO;
import com.vilin.springmvc.chapter13.unit.service.GarageService;
import com.vilin.springmvc.chapter13.unit.service.GarageServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class GarageServiceImplTest {

    @Test
    public void testRentCar() {
        GarageDAO garageDAO = new GarageDAOSpy();
        GarageService garageService = new GarageServiceImpl(garageDAO);
        MyUtility car1 = garageService.rent();
        MyUtility car2 = garageService.rent();
        MyUtility car3 = garageService.rent();
        MyUtility car4 = garageService.rent();
        
        assertNotNull(car1);
        assertNotNull(car2);
        assertNotNull(car3);
        assertNull(car4);
    }

}
