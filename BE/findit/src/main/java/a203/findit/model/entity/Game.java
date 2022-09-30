package a203.findit.model.entity;

import a203.findit.util.JsonToMapConverter;
import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "game")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id", columnDefinition = "BIGINT(20) UNSIGNED")
    private Long id;

    @Column(name="create_time", updatable = false)
    @CreatedDate
    private LocalDateTime createTime;

    @Column(name="start_time")
    private LocalDateTime startTime;

    @Column(name="limit_min")
    private int limitMin;

    @Column(name="end_time")
    private LocalDateTime endTime;

    @Column(name="mode")
    private Mode mode;

    @Column(name="entercode")
    private String entercode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="play_time")
    private long playTime;
}
