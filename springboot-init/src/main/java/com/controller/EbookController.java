package com.controller;

import com.domain.Ebook;
import com.resp.CommonResp;
import com.servicess.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookservice;

    @GetMapping("/list")
    public CommonResp list(String name){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookservice.list(name);
        resp.setContent(list);
        return resp;
    }

}
