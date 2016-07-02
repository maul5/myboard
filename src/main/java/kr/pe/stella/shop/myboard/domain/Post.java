package kr.pe.stella.shop.myboard.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by happy on 2016-07-03.
 */
@Entity
public class Post {
    @Id
    @GeneratedValue
    @Column(name="POST_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="BOARD_ID")
    private Board board;

    private String title;

    private Date wirteDate;

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
}
