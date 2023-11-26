package winey.clone.domain.recommend;

import jakarta.persistence.*;

@Entity
public class Recommend {

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
