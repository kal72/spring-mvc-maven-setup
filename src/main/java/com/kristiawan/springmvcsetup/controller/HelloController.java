package com.kristiawan.springmvcsetup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by kristiawan on 11/8/17.
 */
@RestController
public class HelloController extends BaseController {

    @GetMapping("/")
    public Map<String, Object> helloWord() {
        return convertModel("hello word", HttpStatus.OK);
    }
}
