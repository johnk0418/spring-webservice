package com.jojoldu.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @ResponseBody 를 모든 메소드에 적용해준다. 즉 hello() 메소드의 결과인 "HelloWorld" 문자열을 JSON 형태로 반환해준다.
public class WebRestController {
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
