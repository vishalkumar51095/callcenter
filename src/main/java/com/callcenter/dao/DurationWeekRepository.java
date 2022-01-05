package com.callcenter.dao;

import com.callcenter.entities.Duration;
import com.callcenter.entities.DurationWeek;
import com.callcenter.entities.Volume;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DurationWeekRepository extends CrudRepository<DurationWeek, Integer> {

    @Query(value = "select sum(duration) as totalduration,weekday from  (select id, dayofweek(start_time) as `weekday`,duration  from sample_data ) t group by weekday order by totalduration desc;", nativeQuery = true)

    List<DurationWeek> getWeekday(String value);
}
