package com.xtbtx.parking.parkingapplication.controllers;

import com.xtbtx.parking.parkingapplication.models.Parking;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

  @RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
  public List<Parking> getListParkings() {

    Parking parkingTest = new Parking();

    parkingTest.setNom("Parking de test");

    parkingTest.setNbPlacesTotal(300);

    parkingTest.setNbPlacesDispo(100);

    parkingTest.setStatus("OUVERT");

    parkingTest.setHeureMaj("24h15");

    ArrayList<Parking> list = new ArrayList<>();
    
    list.add(parkingTest);

    return list;

  }

}
