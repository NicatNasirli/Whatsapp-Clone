package personal.whatsappclone.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personal.whatsappclone.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
