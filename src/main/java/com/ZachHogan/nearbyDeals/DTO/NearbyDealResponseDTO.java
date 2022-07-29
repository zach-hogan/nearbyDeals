package com.ZachHogan.nearbyDeals.DTO;

import com.ZachHogan.nearbyDeals.Common.Day;
import com.ZachHogan.nearbyDeals.Common.Type;
import com.ZachHogan.nearbyDeals.Model.NearbyDealModel;
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
