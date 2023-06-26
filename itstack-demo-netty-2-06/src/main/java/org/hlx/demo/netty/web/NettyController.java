package org.hlx.demo.netty.web;

import org.hlx.demo.netty.server.NettyServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 消息传输协议
 * 
 * 
 * 
 * 
 */
@Controller
public class NettyController {

    @Resource
    private NettyServer nettyServer;

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name", "xiaohao");
        return "index";
    }

}
