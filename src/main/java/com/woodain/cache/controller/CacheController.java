package com.woodain.cache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CacheController {

    @RequestMapping(value="/add")
    public String addCache()
    {
        return "index";
    }
}
