package kr.pe.stella.shop.repository;

import kr.pe.stella.shop.domain.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by happy on 2016-07-10.
 */
public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByOrd();
}
