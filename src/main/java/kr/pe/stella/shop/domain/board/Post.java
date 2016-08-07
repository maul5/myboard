package kr.pe.stella.shop.domain.board;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by happy on 2016-07-03.
 */
@Entity
public class Post {
    @Id
    @GeneratedValue
    @Column(name="post_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="board_id")
    private Board board;

    private String title;

    private String contents;

    @Column(nullable = false) //, columnDefinition = "date dafault sysdate"
    @Temporal(TemporalType.TIMESTAMP)
    private Date wirteDate = new Date();

    //연관관계 메소드
    public void setBoard(Board board) {
        this.board = board;
        board.getPosts().add(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Board getBoard() {
        return board;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getWirteDate() {
        return wirteDate;
    }

    public void setWirteDate(Date wirteDate) {
        this.wirteDate = wirteDate;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}