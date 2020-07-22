package com.imooc.reader.service;


import com.imooc.reader.mapper.TestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    //Transactional指定该操作为事务
    @Transactional
    public void batchImport(){
        for(int i=0; i<5;i++){
            testMapper.insertSample();

        }
    }
}
