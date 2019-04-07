package cn.hdu.learn.miaosha.web;

import cn.hdu.learn.miaosha.api.Response;
import cn.hdu.learn.miaosha.internal.api.ro.MiaoshaUserRO;
import cn.hdu.learn.miaosha.internal.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述：
 *
 * @author guaner
 * @date 2019/4/5
 */
@Controller
@RequestMapping("/demo")
public class MiaoshaController {

    @Autowired
    private UserService userService;

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","guamer");
        return "hello";
    }


    @RequestMapping("/db/get")
    @ResponseBody
    public Response<MiaoshaUserRO> dbGet(Long id){
        MiaoshaUserRO user = userService.getUser(id);
        return Response.ok(user);
    }

}
