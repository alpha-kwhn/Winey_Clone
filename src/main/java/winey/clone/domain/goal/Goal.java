package winey.clone.domain.goal;

import jakarta.persistence.*;
import winey.clone.domain.date.BaseTimeLog;
import winey.clone.domain.user.User;

import java.util.Date;

@Entity
public class Goal extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goal_id")
    private Long id;
    private Long targetMoney;
    private Date targetDate;
    private Boolean isAttained;
    private Long duringGoalCount;
    private Long duringGoalAmount;

    @OneToOne
    private User userGoal;

}
