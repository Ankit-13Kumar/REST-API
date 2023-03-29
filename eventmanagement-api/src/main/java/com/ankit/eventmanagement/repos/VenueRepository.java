package com.ankit.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.ankit.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
