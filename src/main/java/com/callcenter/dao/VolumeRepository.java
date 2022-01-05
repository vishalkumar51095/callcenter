package com.callcenter.dao;

import com.callcenter.entities.Volume;
import com.callcenter.entities.VolumeWeek;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VolumeRepository extends CrudRepository<Volume, Integer> {
   //  List<Volume> findByNoofcalls(String count);

    @Query(value = "select count(*) as noofcalls,starthr from  (select id, hour(start_time) as `starthr`, hour(end_time) + 1 as `lasthr` from sample_data ) t group by starthr order by noofcalls desc", nativeQuery = true)
     List<Volume> getNoofcalls(String value);



}
