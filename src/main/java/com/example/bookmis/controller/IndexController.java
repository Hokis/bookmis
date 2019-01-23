package com.example.bookmis.controller;

import com.example.bookmis.entity.BookInfo;
import com.example.bookmis.service.BookInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 控制器
 * by hokis
 */
@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private BookInfoService bookInfoService;
    /**
     * 返回日期
     * @return
     */
    @ResponseBody
    @RequestMapping("/getDate")
    public String getDate(){
        ObjectMapper oMapper = new ObjectMapper();
        try {
            return oMapper.writeValueAsString(new String[]{"1111",LocalDateTime.now().toString()});
        } catch (JsonProcessingException e) {
            logger.warn(e.getMessage());
        }
        return "出错了";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 返回指定ID的图书信息
     * @param bookid
     * @return
     */
    @RequestMapping("/getbook/{id}")
    public ModelAndView getBookInfo(@PathVariable("id") String bookid){
        ModelAndView modelAndView = new ModelAndView("book");
        logger.info("即将查询bookid:"+bookid == null ? "":bookid);
        if (bookid != null){
            BookInfo book = bookInfoService.getByid(bookid);
            logger.info("查询返回："+book.toString());
            modelAndView.addObject("book",book);
        }
        return modelAndView;
    }
}
