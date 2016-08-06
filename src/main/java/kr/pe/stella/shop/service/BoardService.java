package kr.pe.stella.shop.service;

import kr.pe.stella.shop.domain.board.Board;
import kr.pe.stella.shop.domain.board.Post;
import kr.pe.stella.shop.repository.BoardRepository;
import kr.pe.stella.shop.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by happy on 2016-07-10.
 */
@Service
public class BoardService {

    @Autowired
    public PostRepository postRepository;

    @Autowired
    public BoardRepository boardRepository;

    public List<Post> findAllPost() {
        return postRepository.findAll();
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public List<Board> findAllBoard() { return boardRepository.findAll(); }
}
