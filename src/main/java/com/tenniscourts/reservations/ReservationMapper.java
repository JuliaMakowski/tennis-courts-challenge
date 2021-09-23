package com.tenniscourts.reservations;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.ws.rs.MatrixParam;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    @Mapping(target = "schedule", source = "schedule")
    @Mapping(target = "reservationStatus", source = "reservationStatus")
    @Mapping(target = "refundValue", source = "refundValue")
    @Mapping(target = "value", source = "value")
    @Mapping(target = "scheduledId", source = "schedule.id")
    @Mapping(target = "guestId", source = "guest")
    @Mapping(target = "previousReservation", source = "previousReservation")
    ReservationDTO map(Reservation source);

    @InheritInverseConfiguration
    Reservation map(ReservationDTO source);

    @Mapping(target = "guest.id", source = "guestId")
    @Mapping(target = "schedule.id", source = "scheduleId")
    Reservation map(CreateReservationRequestDTO source);
}
