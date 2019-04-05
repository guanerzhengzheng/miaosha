package cn.hdu.learn.miaosha.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：
 *
 * @author guaner
 * @date 2019/4/5
 */
@Controller
@RequestMapping("/demo")
public class MiaoshaController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","guamer");
        return "hello";
    }


}
