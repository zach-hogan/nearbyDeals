package com.ZachHogan.nearbyDeals.Repository;

import com.ZachHogan.nearbyDeals.Model.NearbyDealModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NearbyDealsRepository
        extends JpaRepository<NearbyDealModel, Long> {

}
