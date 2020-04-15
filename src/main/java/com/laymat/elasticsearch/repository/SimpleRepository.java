package com.laymat.elasticsearch.repository;

import com.laymat.elasticsearch.entity.SimpleEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author: laymat
 * @desc:
 * @date: 2020/4/7
 */
@Component
public interface SimpleRepository extends ElasticsearchRepository<SimpleEntity, String> {
}
