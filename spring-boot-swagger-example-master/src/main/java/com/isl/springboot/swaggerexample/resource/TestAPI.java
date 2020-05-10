package com.isl.springboot.swaggerexample.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.isl.models.PostRequest;
import com.isl.models.PostResponse;
import com.isl.models.SampleResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@RequestMapping("/rest/api")
@Api(value = "REST API", description = "REST API")
public class TestAPI {
	
	@ApiOperation(value = "Returns REST API")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Hello World")
            }
    )

@RequestMapping(value ="/getapi", method = RequestMethod.GET)
public @ResponseBody SampleResponse Sample(@RequestParam(value = "name",
defaultValue = "Robot") String name) {
	SampleResponse response = new SampleResponse();
	response.setId(1);
	response.setMessage("Your name is "+name);
	return response;

}
@RequestMapping(value = "/addapi", method = RequestMethod.POST)
public @ResponseBody PostResponse Test(@RequestBody PostRequest inputPayload) {
	PostResponse response = new PostResponse();
	response.setId(inputPayload.getId()*100);
	response.setMessage("Hello " + inputPayload.getName());
	response.setExtra("Welcome");
	return response;
}
@RequestMapping(value="/updateapi", method = RequestMethod.PUT)
public @ResponseBody PostResponse update(@RequestBody PostRequest inputPayload) {
	PostResponse response = new PostResponse();
	response.setId(inputPayload.getId()*100);
	response.setMessage("Hello " + inputPayload.getName());
	response.setExtra("Welcome");
	return response;
}

@RequestMapping(value="/deleteapi", method = RequestMethod.DELETE)
public @ResponseBody String delete(@RequestBody String hello) {
	return hello;
}
@RequestMapping(value="/patchapi", method = RequestMethod.PATCH)
public @ResponseBody String patch(@RequestBody String hello) {
	return hello;
}
}
