package com.example.UrlHitCounterApplication.controller;

import com.example.UrlHitCounterApplication.model.UrlData;
import com.example.UrlHitCounterApplication.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/urlHitCount")
public class UrlHitController {

    @Autowired
    private UrlService urlService;

//    @GetMapping(value = "/count")
//    public UrlData getHitCount(){
//        return urlService.getHit();
//    }

    @GetMapping("username/{username}/count")
    public UrlData getHitCount(@PathVariable String username){
        return urlService.getHit(username);
    }
}
