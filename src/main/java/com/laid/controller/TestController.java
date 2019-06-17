package com.laid.controller;

import com.laid.pojo.dto.Flag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author laid
 * @title: TestController
 * @projectName test
 * @description: TODO
 * @date 2019/6/1620:25
 */
@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

  @Autowired
  Flag flag;
  @Value("#{testProperties[name]}")
  String name;
  @RequestMapping("/test1")
  @ResponseBody
  public Object test1() throws Exception {
    System.out.println(flag.getFlag());
    System.out.println(name);
    log.info("test1 invoked!!!!!!!!");
    if (flag==null) {
      throw new Exception();
    }
    return "hello world";
  }
}
