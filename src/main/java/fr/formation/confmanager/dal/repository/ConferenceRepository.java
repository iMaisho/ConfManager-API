package fr.formation.confmanager.dal.repository;

import fr.formation.confmanager.dal.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Conference entity.
 */
@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}