package kr.pe.stella.shop.repository;

import kr.pe.stella.shop.domain.board.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by happy on 2016-07-10.
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByBoardIdOrderByIdDesc(String boardId);
}
