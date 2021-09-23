package com.tenniscourts.schedules;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ScheduleMapper {

    @Mapping(target = "tennisCourt", source = "tennisCourt")
    @Mapping(target = "startDateTime", source = "startDateTime")
    @Mapping(target = "endDateTime", source = "endDateTime")
    ScheduleDTO map(Schedule source);

    @InheritInverseConfiguration
    Schedule map(ScheduleDTO source);

    List<ScheduleDTO> map(List<Schedule> source);
}
