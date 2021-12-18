package com.xtbtx.parking.parkingapplication.controllers;

import com.xtbtx.parking.parkingapplication.models.Parking;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

  @RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
  public List<Parking> getListParkings() {
    return null;
  }

}
