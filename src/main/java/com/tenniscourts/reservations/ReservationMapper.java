package com.tenniscourts.reservations;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.ws.rs.MatrixParam;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
//    @Mapping(target = "previousReservation", source = "previousReservation")

    @Mapping(target = "id", source = "id")
    @Mapping(target = "schedule", source = "schedule")
    @Mapping(target = "reservationStatus", source = "reservationStatus")
    @Mapping(target = "refundValue", source = "refundValue")
    @Mapping(target = "value", source = "value")
    @Mapping(target = "schedule.id", source = "scheduledId")
    @Mapping(target = "guest", source = "guestId")
    Reservation map(ReservationDTO source);

    @InheritInverseConfiguration
    ReservationDTO map(Reservation source);

    @Mapping(target = "guest.id", source = "guestId")
    @Mapping(target = "schedule.id", source = "scheduleId")
    Reservation map(CreateReservationRequestDTO source);
}
