package com.ankit.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.ankit.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant,Long> {

}
