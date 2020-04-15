package com.laymat.elasticsearch.service.impl;

import com.laymat.elasticsearch.entity.SimpleEntity;
import com.laymat.elasticsearch.repository.SimpleRepository;
import com.laymat.elasticsearch.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: laymat
 * @desc:
 * @date: 2020/4/7
 */
@Service
public class SimpleServiceImpl implements SimpleService {
    @Autowired
    public SimpleServiceImpl(SimpleRepository simpleRepository) {
        this.simpleRepository = simpleRepository;
    }

    SimpleRepository simpleRepository;

    @Async
    @Override
    public void save(SimpleEntity entity) {
        simpleRepository.save(entity);
    }

    @Override
    public List<SimpleEntity> all() {
        var list = new ArrayList<SimpleEntity>();
        simpleRepository.findAll().forEach(list::add);
        return list;
    }
}
