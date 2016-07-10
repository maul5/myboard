package kr.pe.stella.shop.service;

import kr.pe.stella.shop.domain.board.Post;
import kr.pe.stella.shop.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by happy on 2016-07-10.
 */
@Service
public class BoardService {

    @Autowired
    public BoardRepository boardRepository;

    public List<Post> findAll() {
        return boardRepository.findAll();
    }
}
