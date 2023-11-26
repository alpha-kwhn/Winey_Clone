package winey.clone.domain.feedLike;

import jakarta.persistence.*;
import winey.clone.domain.feed.Feed;
import winey.clone.domain.user.User;

@Entity
public class FeedLike {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_like_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User likeUser;
    @ManyToOne
    @JoinColumn(name = "feed_id")
    private Feed likeFeed;
}
