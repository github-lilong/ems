package com.baizhi.controller;
import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Controller
@RequestMapping("/captcha")
public class CaptchaController {
    @Autowired
    private HttpSession session;
    @RequestMapping("/code")
    public void code(HttpServletResponse resp) throws Exception{
        ServletOutputStream os = resp.getOutputStream();
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(80, 50, 4, 5);
        String code = captcha.getCode();
        session.setAttribute("code",code);
        captcha.write(os);
        os.flush();
    }
}
