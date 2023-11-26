package winey.clone.domain.goal;

import jakarta.persistence.*;
import winey.clone.domain.feed.Feed;
import winey.clone.domain.user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Goal {

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
