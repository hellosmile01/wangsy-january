package smile.wangsy.january.sso.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.smile.common.base.BaseResult;

/**
 * @author: wangsy
 * @date: 2018/9/15 21:37
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping("register")
    public BaseResult register() {


        return null;
    }
}
