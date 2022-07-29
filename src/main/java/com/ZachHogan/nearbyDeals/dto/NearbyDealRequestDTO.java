package com.ZachHogan.nearbyDeals.dto;

import com.ZachHogan.nearbyDeals.common.Day;
import com.ZachHogan.nearbyDeals.common.Type;
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
