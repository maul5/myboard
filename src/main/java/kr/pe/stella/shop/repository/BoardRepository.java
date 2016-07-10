package kr.pe.stella.shop.repository;

import kr.pe.stella.shop.domain.board.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by happy on 2016-07-10.
 */
public interface BoardRepository extends JpaRepository<Post, Long> {
}
