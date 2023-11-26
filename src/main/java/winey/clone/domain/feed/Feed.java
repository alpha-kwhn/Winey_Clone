package winey.clone.domain.feed;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import winey.clone.domain.comment.Comment;
import winey.clone.domain.goal.Goal;
import winey.clone.domain.user.User;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Feed {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User feedUser;
    @ManyToOne
    @JoinColumn(name = "goal_id")
    private Goal goal;
    private String feedTitle;
    private Long feedMoney;
    private String feedImage;
    @OneToMany(mappedBy = "feedComment")
    private List<Comment> comments;
    @OneToMany(mappedBy = "likeFeed")
    private List<Feed> likes;
}
