package be.vdab.landen.services;

import be.vdab.landen.repositories.LandRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Service
@Transactional
class DefaultLandService implements LandService {
    private final LandRepository repository;

    public DefaultLandService(LandRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public long findAantal() {
        return repository.count();
    }
}
