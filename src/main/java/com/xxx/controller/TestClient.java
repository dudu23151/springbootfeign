package com.xxx.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("springbootribbon")
public interface TestClient {
	@RequestMapping(method = RequestMethod.GET, value = "/")
	String aaa();
}
