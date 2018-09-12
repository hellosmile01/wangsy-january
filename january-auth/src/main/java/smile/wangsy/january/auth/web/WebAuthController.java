package smile.wangsy.january.auth.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Juzi
 * @Date 2018/9/12.
 */
@RestController
public class WebAuthController {

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login.html");
    }

}
