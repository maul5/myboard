package kr.pe.stella.shop.myboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by happy on 2016-07-03.
 */
@Entity
public class Board {
    @Id
    @Column(name="board_id")
    private String id;

    private String name;

    @OneToMany(mappedBy = "board")
    private List<Post> posts = new ArrayList<Post>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
