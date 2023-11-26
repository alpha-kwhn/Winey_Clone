package winey.clone.domain.recommend;

import jakarta.persistence.*;
import winey.clone.domain.date.BaseTimeLog;

@Entity
public class Recommend extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recommend_id")
    private Long id;
    private Long recommendWon;
    private String recommendTitle;
    private String recommendSubTitle;
    private Long recommendPercent;
    private String recommendLink;
    private String recommendImage;
}
