package com.imooc.reader.service.impl;

import com.imooc.reader.entity.Evaluation;
import com.imooc.reader.service.EvaluationService;
import com.imooc.reader.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MemberServiceImplTest {
    @Resource
    private MemberService memberService;

    @Test
    public void createMember() {
        memberService.createMember("s1234567", "1234567", "test2");
    }

    @Test
    public void enjoy(){
        Evaluation enjoy = memberService.enjoy(1L);
        System.out.println(enjoy.toString());
    }
}