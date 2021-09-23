package com.tenniscourts.schedules;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ScheduleMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "tennisCourt", source = "tennisCourt")
    @Mapping(target = "startDateTime", source = "startDateTime")
    @Mapping(target = "endDateTime", source = "endDateTime")
    Schedule map(ScheduleDTO source);

    @InheritInverseConfiguration
    ScheduleDTO map(Schedule source);

    //@Mapping(target = "tennisCourt", source = "tennisCourt")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "startDateTime", source = "startDateTime")
    @Mapping(target = "endDateTime", source = "endDateTime")
    List<ScheduleDTO> map(List<Schedule> source);
}
