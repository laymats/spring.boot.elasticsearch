package com.laymat.elasticsearch.service;

import com.laymat.elasticsearch.entity.SimpleEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author: laymat
 * @desc:
 * @date: 2020/4/7
 */
public interface SimpleService {
    void save(SimpleEntity entity);

    List<SimpleEntity> all();
}
