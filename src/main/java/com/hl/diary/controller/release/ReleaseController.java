package com.hl.diary.controller.release;

import com.alibaba.fastjson.JSON;
import com.hl.diary.pojo.Release;
import com.hl.diary.result.Result;
import com.hl.diary.service.ReleaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/diary")
public class ReleaseController {
    private static Logger log = Logger.getLogger(ReleaseController.class);
    @Autowired
    private ReleaseService releaseService;


    @RequestMapping(value = "/add",method = {RequestMethod.POST},produces = "application/json")
    public Result addContent(@RequestBody Release release){
        log.debug("xxxxxxxxx1>" + JSON.toJSONString(release));
        int i = releaseService.insertSelective(release);
        log.debug("xxxxxxxxx>" + release);
        Result result = new Result(200,"aww");
        return result;
    }
}
