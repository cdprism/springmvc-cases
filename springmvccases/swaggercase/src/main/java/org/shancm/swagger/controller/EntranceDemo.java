package org.shancm.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.shancm.swagger.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shancm
 * @pachage org.shancm.swagger.controller
 * @description:
 * @date 2018/6/12
 */
@RestController
@Api
@RequestMapping(value = "/swagger")
public class EntranceDemo {

    @ApiOperation(value="获取用户列表", notes="this is note")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful — 请求已完成"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")}
    )
    @RequestMapping(value="/list", method= RequestMethod.GET)
    public List<User> getUserList() {
        List<User> list = new ArrayList<User>();
        return list;
    }
}
