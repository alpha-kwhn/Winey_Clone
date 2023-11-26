package winey.clone.domain.notification;

import jakarta.persistence.*;
import winey.clone.domain.date.BaseTimeLog;
import winey.clone.domain.user.User;

@Entity
public class Notification extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noti_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "receive_user")
    private User receiveUser;
    private Long responseId;
    private Long requestUserId;
    private String notiMessage;
    private Long linkId;
    private Boolean isChecked;
}
