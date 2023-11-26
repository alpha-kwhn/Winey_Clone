package winey.clone.domain.comment;

import jakarta.persistence.*;
import winey.clone.domain.feed.Feed;
import winey.clone.domain.user.User;

@Entity
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userComment;

    @ManyToOne
    @JoinColumn(name = "feed_id")
    private Feed feedComment;

    private String content;
}
