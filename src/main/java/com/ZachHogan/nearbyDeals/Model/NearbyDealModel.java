package com.ZachHogan.nearbyDeals.Model;

import com.ZachHogan.nearbyDeals.Common.Day;
import com.ZachHogan.nearbyDeals.Common.Type;
import com.ZachHogan.nearbyDeals.DTO.NearbyDealRequestDTO;
import com.ZachHogan.nearbyDeals.DTO.NearbyDealResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "nearbydeals")
@AllArgsConstructor
@NoArgsConstructor
public class NearbyDealModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    String organizationName;
    String description;
    Type type;
    Day day;


    public NearbyDealModel(NearbyDealRequestDTO nearbyDealRequestDTO){
        this.type = nearbyDealRequestDTO.getType();
        this.day = nearbyDealRequestDTO.getDay();
        this.organizationName = nearbyDealRequestDTO.getOrganizationName();
        this.description =nearbyDealRequestDTO.getDescription();
    }

    public NearbyDealResponseDTO modelToResponseDTO(NearbyDealModel nearbyDealModel){
        return NearbyDealResponseDTO.builder()
                .organizationName(nearbyDealModel.getOrganizationName())
                .day(nearbyDealModel.getDay())
                .description(nearbyDealModel.getDescription())
                .type(nearbyDealModel.getType())
                .build();
    }

}
