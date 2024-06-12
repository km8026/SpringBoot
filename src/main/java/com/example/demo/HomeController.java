package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.component.Bean3;
import com.example.demo.component.ImageUtil;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public
 class HomeController {
@GetMapping("/test/html")
public String testHtml() {
  return  "home";
}
@GetMapping("/test/html2")
@ResponseBody
public String testHtml2() {
  return  "home";
}
@GetMapping("/test/json")
@ResponseBody
public Map testJson() {
  Map map = new HashMap();
  map.put("key1", true);
  map.put("key2", 1234);
  map.put("key3", "awerw");
  return  map;
}
@GetMapping("/test/emp")
@ResponseBody
public List testEmp() {
  List<Map<String, Object>> list2 = jt.queryForList("select * from emp");
  return list2;
}


@GetMapping("/test/json2")
@ResponseBody
public List testJson2() {
  List list = new ArrayList();
  Map map = new HashMap();
  map.put("key1", true);
  map.put("key2", 1234);
  map.put("key3", "awerw");
  list.add(map);
  return  list;
}
@GetMapping("/test/json3")
@ResponseBody
public Car testJson3() {
  Car car = new Car();
  car.setTire(4);
  car.setModel("EV6");
  return  car;
}

  @Autowired String bean1;
  @Autowired JdbcTemplate jt;
  @Autowired Game game;
  @Autowired Bean3 bean3;
  @Autowired Car car;
  @Autowired ImageUtil imageUtil;

  @RequestMapping("/")
  public String home() {
    try {
      imageUtil.save("http://ggoreb.com/images/luffy.jpg");
    } catch (IOException e) {
      e.printStackTrace();
    }
    this.car.run();
    
    log.info(bean3.run());
    log.info(game.play());
    log.info(bean1);

    Car car = new Car();
    car.setTire(3);
    car.setModel("KIA");
    log.info(car.toString());

    List<Map<String, Object>> list = jt.queryForList("select * from dept");
    System.out.println(list);
    log.info(list.toString());
    return "home";
  }
}
