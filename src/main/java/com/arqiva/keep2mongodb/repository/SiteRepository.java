package com.arqiva.keep2mongodb.repository;

import com.arqiva.keep2mongodb.entity.Site;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pranjal.mathur on 31/08/2016.
 */
public interface SiteRepository extends MongoRepository<Site,Long> {

    Site findBySiteId(Long siteId);

}
