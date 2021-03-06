package be.vdab.landen.repositories;

import be.vdab.landen.domain.Land;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public interface LandRepository extends JpaRepository<Land, String> { }
