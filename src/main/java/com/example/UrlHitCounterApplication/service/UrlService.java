package com.example.UrlHitCounterApplication.service;


import com.example.UrlHitCounterApplication.model.UrlData;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {

//    static int count=0;
//    public UrlData getHit(String username) {
//        UrlData urlData=new UrlData(++count);
//        return urlData;
//    }


    static Map<String, Integer> hmap = new HashMap<>();
    public UrlData getHit(String username) {
        int count = 1;
        if (hmap.containsKey(username)) {
            count = hmap.get(username);
            hmap.put(username, ++count);
        }else{
            hmap.put(username, count);
        }
        UrlData hit = new UrlData(username, count);
        return hit;
    }
}
