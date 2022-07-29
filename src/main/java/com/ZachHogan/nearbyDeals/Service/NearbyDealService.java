package com.ZachHogan.nearbyDeals.Service;

import com.ZachHogan.nearbyDeals.DTO.NearbyDealResponseDTO;
import com.ZachHogan.nearbyDeals.Model.NearbyDealModel;
import com.ZachHogan.nearbyDeals.Repository.NearbyDealsRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
public class NearbyDealService {

    private NearbyDealsRepository nearbyDealsRepository;

    @Autowired
    public NearbyDealService(NearbyDealsRepository nearbyDealsRepository) {
        this.nearbyDealsRepository = nearbyDealsRepository;
    }

    public List<NearbyDealResponseDTO> getNearbyDeals(){
        List<NearbyDealModel> nearbyDealModels = nearbyDealsRepository.findAll();
        List<NearbyDealResponseDTO> nearbyDealResponseDTOS = new ArrayList<>();
        for (NearbyDealModel nearbyDealModel : nearbyDealModels) {
            nearbyDealResponseDTOS.add(new NearbyDealResponseDTO(nearbyDealModel));
        }
        return nearbyDealResponseDTOS;
    }

    public void addNewDeal(NearbyDealModel nearbyDealModel){
        nearbyDealsRepository.save(nearbyDealModel);
    }
}
