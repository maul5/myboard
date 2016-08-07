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
    public BoardRepository boardRepository;
    @Autowired
    public PostRepository postRepository;

    /**
     * 모든 게시판 목록을 가져온다.
     * @return
     */
    public List<Board> findAllBoard() {
        return boardRepository.findAllByOrderByOrd();
    }

    /**
     * board.id에 해당하는 게시글 목록을 post_id로 내림차순으로 가져온다.
     * @param boardId
     * @return
     */
    public List<Post> findAllPost(String boardId) {
        return postRepository.findByBoardIdOrderByIdDesc(boardId);
    }

    /**
     * 게시글을 저장한다.
     * @param post
     * @return
     */
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
