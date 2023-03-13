package com.example.flightfinderbackend.repository;

import com.example.flightfinderbackend.model.Booking;
import com.example.flightfinderbackend.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
    @Query("SELECT f FROM Flight f JOIN f.itineraries i WHERE f.departureDestination = :departureDestination AND f.arrivalDestination = :arrivalDestination AND i.departureAt BETWEEN :from AND :to")
    List<Flight> findAvailableFlights(@Param("departureDestination") String departureDestination,
                                      @Param("arrivalDestination") String arrivalDestination,
                                      @Param("from") LocalDateTime from,
                                      @Param("to") LocalDateTime to);

    @Query("SELECT b FROM Booking b WHERE b.id = :id")
    Optional<Booking> findBookingById(@Param("id") String id);
}

