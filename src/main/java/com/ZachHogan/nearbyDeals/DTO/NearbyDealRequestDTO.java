package com.ZachHogan.nearbyDeals.DTO;

import com.ZachHogan.nearbyDeals.Common.Day;
import com.ZachHogan.nearbyDeals.Common.Type;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NearbyDealRequestDTO {
    String organizationName;
    String description;
    Day day;
    Type type;
}
