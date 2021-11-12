package com.controller;

import com.req.EbookReq;
import com.resp.CommonResp;
import com.resp.EbookResp;
import com.resp.PageResp;
import com.servicess.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookservice;

    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookservice.list(req);
        resp.setContent(list);
        return resp;
    }

}
