package kr.pe.stella.shop.web;

import kr.pe.stella.shop.domain.board.Board;
import kr.pe.stella.shop.domain.board.Post;
import kr.pe.stella.shop.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by happy on 2016-07-10.
 */
@Controller
@RequestMapping("/board")
public class BoardWeb {

    @Autowired
    public BoardService boardService;

    /**
     * 보고 싶은 게시판ID를 넣고 목록을 조회한다.
     * @param model
     * @param boardId
     * @return
     */
    @RequestMapping("/{boardId}/list")
    public String list(Model model, @PathVariable String boardId) {
        List<Post> posts = boardService.findAllPost(boardId);
        model.addAttribute("posts", posts);

        return "board/list";
    }

    /**
     * 글 작성 폼 화면 호출
     * @return
     */
    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public ModelAndView write() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("boards", getBoardComboList());
        mav.addObject("post", new Post());
        mav.setViewName("board/write");

        return mav;
    }

    /**
     * 작성된 글 저장 후 결과를 폼 화면에 표시
     * @param post
     * @return
     */
    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public ModelAndView write(Post post) {
        Post result = boardService.save(post);

        ModelAndView mav = new ModelAndView();
        mav.addObject("boards", getBoardComboList());
        mav.addObject("post", post);
        mav.setViewName("board/write");

        return mav;
    }

    /**
     * 게시판 목록을 조회한다.
     * @return
     */
    private List<Board> getBoardComboList() {
        List<Board> boards = boardService.findAllBoard();
        return boards;
    }
}
