package com.ZachHogan.nearbyDeals.dto;

import com.ZachHogan.nearbyDeals.common.Day;
import com.ZachHogan.nearbyDeals.common.Type;
import com.ZachHogan.nearbyDeals.model.NearbyDealModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NearbyDealResponseDTO {
    String organizationName;
    String description;
    Day day;
    Type type;

    public NearbyDealResponseDTO (NearbyDealModel nearbyDealModel){
        this.organizationName = nearbyDealModel.getOrganizationName();
        this.description = nearbyDealModel.getDescription();
        this.day = nearbyDealModel.getDay();
        this.type = nearbyDealModel.getType();
    }
}
