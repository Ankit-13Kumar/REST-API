package com.ankit.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.ankit.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
