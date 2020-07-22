package com.imooc.reader.task;

import com.imooc.reader.service.BookService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 完成自动计算任务
 */
@Component
public class ComputeTask {
    @Resource
    private BookService bookService;

    @Scheduled(cron = "0 * * * * ?") //任务调度
    public void updateEvaluation(){
        bookService.updateEValuation();
        System.out.println("已更新所有图书评分");
    }
}
