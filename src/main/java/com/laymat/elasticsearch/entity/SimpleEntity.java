package com.laymat.elasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @author: laymat
 * @desc:
 * @date: 2020/4/7
 */
@Data
@Document(indexName = "simple_entity")
@TypeAlias("SimpleEntity")
public class SimpleEntity{
    @Id
    String id;
    String name;
    Date time;
}
