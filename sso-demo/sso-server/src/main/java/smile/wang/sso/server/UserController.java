package smile.wang.sso.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

/**
 * @author wangsy
 */
@RestController
public class UserController {

    @RequestMapping("/user/me")
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }


    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login.html");
    }
}
