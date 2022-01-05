package com.callcenter;

import com.callcenter.dao.DurationRepository;
import com.callcenter.dao.DurationWeekRepository;
import com.callcenter.dao.VolumeRepository;
import com.callcenter.dao.VolumeWeekRepository;
import com.callcenter.entities.Duration;
//import com.callcenter.entities.User;
import com.callcenter.entities.DurationWeek;
import com.callcenter.entities.Volume;
import com.callcenter.entities.VolumeWeek;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CallcenterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CallcenterApplication.class, args);

        VolumeRepository userRepository1 = context.getBean(VolumeRepository.class);
        DurationRepository userRepository2 = context.getBean(DurationRepository.class);
        VolumeWeekRepository userRepository3 = context.getBean(VolumeWeekRepository.class);
        DurationWeekRepository userRepository4 = context.getBean(DurationWeekRepository.class);


        System.out.println("---------------CALL CENTER-------------------");
        System.out.print("<1> Hour of the day when the call volume is highest. Answer->");
        List<Volume> volumes = userRepository1.getNoofcalls("value");
        //System.out.println(volumes.get(0));
        System.out.println(volumes.get(0).getStarthr()+"-"+(volumes.get(0).getStarthr()+1));
       /*for (Volume e : volumes) {
            System.out.println(e);
        }*/

        System.out.println("____________________________________________");
        System.out.print("<2> Hour of the day when the calls are longest. Answer->");
        List<Duration> duration = userRepository2.getStarthr("value");
        //System.out.println(duration.get(0));
        System.out.println(duration.get(0).getStarthr()+"-"+(duration.get(0).getStarthr()+1));
        /*for (Duration e : duration) {
            System.out.println(e);
        }*/


        System.out.println("____________________________________________");
        System.out.print("<3> Day of the week when the call volumes is highest. Answer->");
        List<VolumeWeek> volumeWeeks = userRepository3.getNoofcalls("value");
        System.out.println(volumeWeeks.get(0).getWeekday());
       /* for (VolumeWeek e : volumeWeeks) {
            System.out.println(e);
        }*/

        System.out.println("____________________________________________");
        System.out.print("<4> Day of the week when the calls are longest. Answer->");
        List<DurationWeek> durationWeeks = userRepository4.getWeekday("value");
        System.out.println(durationWeeks.get(0).getWeekday());
        /*for (DurationWeek e : durationWeeks) {
          System.out.println(e);
        }*/
        System.out.println("____________________________________________");

    }

}
