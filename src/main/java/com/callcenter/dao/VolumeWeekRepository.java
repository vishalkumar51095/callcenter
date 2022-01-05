package com.callcenter.dao;

import com.callcenter.entities.Volume;
import com.callcenter.entities.VolumeWeek;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VolumeWeekRepository extends CrudRepository<VolumeWeek, Integer> {
    // List<Volume> findByNoofcalls(String count);

    @Query(value = "select count(*) as noofcalls,weekday from  (select id, dayofweek(start_time) as `weekday` from sample_data ) t group by weekday order by noofcalls desc", nativeQuery = true)
    List<VolumeWeek> getNoofcalls(String value);



}
