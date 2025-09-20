package personal.whatsappclone.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personal.whatsappclone.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
