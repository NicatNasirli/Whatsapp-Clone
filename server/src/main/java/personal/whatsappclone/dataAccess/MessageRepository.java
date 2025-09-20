package personal.whatsappclone.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personal.whatsappclone.entities.Message;

import java.util.Optional;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    Optional<Message> findBySenderIdAndAndReceiverId(Long userid1, Long userid2);
}
