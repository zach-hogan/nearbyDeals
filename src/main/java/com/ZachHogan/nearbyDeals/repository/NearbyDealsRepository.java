package com.ZachHogan.nearbyDeals.repository;

import com.ZachHogan.nearbyDeals.model.NearbyDealModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NearbyDealsRepository
        extends JpaRepository<NearbyDealModel, Long> {

}
