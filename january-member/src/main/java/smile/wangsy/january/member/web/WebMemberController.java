package smile.wangsy.january.member.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wangsy
 * @Date 2018/8/29.
 */
@RestController
@RequestMapping("web/member")
public class WebMemberController {

    @RequestMapping({"/", "/index.html"})
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

}
