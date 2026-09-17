package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Megumin
 * @create 2026-09-10 5:49 PM
 */

// Controller to receive web traffic
@Controller
public class HomeController {

    // 獲取 application.properties 的參數並注入
    @Value("${spring.application.name}")
    private String appName;

    // 當我們向網站根目錄發送請求時，希望調用此方法
    @RequestMapping("/")
    public String index() {
        System.out.println("appName: " + appName);
        return "index.html";
//        return "forward:/index.html";
    }
}
