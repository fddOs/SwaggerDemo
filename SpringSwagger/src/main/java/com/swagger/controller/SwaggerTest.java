package com.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;



@Controller
@Api(description = "用户")
@RequestMapping("/user")
public class SwaggerTest {
	@ResponseBody
	@RequestMapping(value = "/swagger", method = RequestMethod.GET)
	@ApiOperation(value = "Test",httpMethod="GET")
	public String test(@ApiParam(name = "str", required = true, value = "Fdd") @RequestParam String str) {
		return str;
	}

}
