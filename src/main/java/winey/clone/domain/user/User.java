package winey.clone.domain.user;

import jakarta.persistence.*;
import winey.clone.domain.comment.Comment;
import winey.clone.domain.feed.Feed;
import winey.clone.domain.feedLike.FeedLike;
import winey.clone.domain.goal.Goal;
import winey.clone.domain.notification.Notification;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private Level userLevel;
    @Enumerated(value = EnumType.STRING)
    private SocialType socialType;
    private String socialId;
    private String refreshToken;
    private String nickName;
    @OneToMany(mappedBy = "feedUser")
    private List<Feed> feedList;
    @OneToOne(mappedBy = "userGoal")
    private Goal goal;
    @OneToMany(mappedBy = "userComment")
    private List<Comment> commentList;
    @OneToMany(mappedBy = "likeUser")
    private List<FeedLike> likeFeed;
    @OneToMany(mappedBy = "receiveUser")
    private List<Notification> notiList;
}
