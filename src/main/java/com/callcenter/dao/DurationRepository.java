package com.callcenter.dao;

import com.callcenter.entities.Duration;
import com.callcenter.entities.Volume;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DurationRepository extends CrudRepository<Duration, Integer> {
    //public List<Duration> findByStarthr(String sum);

    @Query(value = "select sum(duration) as totalduration,starthr from  (select id, hour(start_time) as `starthr`, hour(end_time) + 1,duration  from sample_data ) t group by starthr order by totalduration desc", nativeQuery = true)
    List<Duration> getStarthr(String value);
}
