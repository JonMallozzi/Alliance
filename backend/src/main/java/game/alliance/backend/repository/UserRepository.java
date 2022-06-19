package game.alliance.backend.repository;

import game.alliance.backend.model.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CouchbaseRepository<User, UUID> {
}
