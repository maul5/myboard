package kr.pe.stella.shop.web;

import kr.pe.stella.shop.domain.board.Post;
import kr.pe.stella.shop.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/list")
    public String list(Model model) {
        List<Post> posts = boardService.findAll();
        model.addAttribute("posts", posts);

        return "board/list";
    }
}
