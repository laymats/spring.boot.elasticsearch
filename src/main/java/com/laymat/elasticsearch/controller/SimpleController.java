package com.laymat.elasticsearch.controller;

import com.laymat.elasticsearch.entity.SimpleEntity;
import com.laymat.elasticsearch.service.SimpleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author: laymat
 * @desc:
 * @date: 2020/4/7
 */
@Controller
@RequestMapping("/simple")
@Api(value = "simple", tags = "测试Controller")
public class SimpleController {

    @Autowired
    public SimpleController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    SimpleService simpleService;

    @GetMapping("/save")
    @ResponseBody
    @ApiOperation(value = "新增测试数据")
    Object save(@RequestParam String name) {
        var entity = new SimpleEntity();
        entity.setName(name);
        entity.setTime(new Date());
        simpleService.save(entity);
        return "success";
    }

    @GetMapping("/all")
    @ResponseBody
    @ApiOperation(value = "获取所有测试数据")
    ResponseEntity all() {
        return new ResponseEntity(simpleService.all(), HttpStatus.OK);
    }
}
