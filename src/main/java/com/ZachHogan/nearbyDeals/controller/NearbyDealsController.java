package com.ZachHogan.nearbyDeals.controller;

import com.ZachHogan.nearbyDeals.dto.NearbyDealRequestDTO;
import com.ZachHogan.nearbyDeals.dto.NearbyDealResponseDTO;
import com.ZachHogan.nearbyDeals.model.NearbyDealModel;
import com.ZachHogan.nearbyDeals.service.NearbyDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/nearbyDeals/v1")
public class NearbyDealsController {

    @Autowired
    public NearbyDealsController (NearbyDealService nearbyDealService){
        this.nearbyDealService = nearbyDealService;
    }
    @Autowired
    NearbyDealService nearbyDealService;

    @GetMapping(path = "/deals")
    public ResponseEntity<List<NearbyDealResponseDTO>> getAllNearbyDeals(){
        List<NearbyDealResponseDTO> nearbyDeals = nearbyDealService.getNearbyDeals();
//        nearbyDeals.add(NearbyDealResponseDTO.builder().organizationName("McDonalds").type(Type.FOOD).day(Day.FRIDAY).build());
//        nearbyDeals.add(NearbyDealResponseDTO.builder().organizationName("Elrays").type(Type.DRINK).day(Day.MONDAY).build());
        return new ResponseEntity<>(nearbyDeals , HttpStatus.OK);
    }

    @GetMapping(path = "/deals/{id}")
    public ResponseEntity<NearbyDealResponseDTO> getNearbyDeal(){
        return null;
    }

    @PostMapping(path = "/deals")
    public ResponseEntity<NearbyDealResponseDTO> addNewNearbyDeal(@RequestBody NearbyDealRequestDTO nearbyDealRequestDTO){
        NearbyDealModel nearbyDealModel = new NearbyDealModel(nearbyDealRequestDTO);
        nearbyDealService.addNewDeal(nearbyDealModel);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(path = "/deals/{id}")
    public ResponseEntity<NearbyDealResponseDTO> updateDeal(){
        return null;
    }

    @DeleteMapping(path = "/deals")
    public ResponseEntity<HttpStatus> deleteDeals(){
        return null;
    }

    @DeleteMapping(path = "/deals/{id}")
    public ResponseEntity<HttpStatus> deleteDeal(){
        return null;
    }


}
