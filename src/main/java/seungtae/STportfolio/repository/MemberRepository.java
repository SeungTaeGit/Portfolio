package seungtae.STportfolio.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import seungtae.STportfolio.domain.Manager;

import java.util.*;

@Repository
@Slf4j
public class MemberRepository {

    private static Map<Long, Manager> store = new HashMap<>();

    public Manager save(Manager manager) {
        store.put(manager.getSequence(), manager);
        return manager;
    }

    public Manager findBySequence(Long sequence) {
        return store.get(sequence);
    }

    public Optional<Manager> findById(String Id) {
        return findAll().stream()
                .filter(m -> m.getId().equals(Id))
                .findFirst();
    }

    public List<Manager> findAll() {
        return new ArrayList<>(store.values());
    }
}
