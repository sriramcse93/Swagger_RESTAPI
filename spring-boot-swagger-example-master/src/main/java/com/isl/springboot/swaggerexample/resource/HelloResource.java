package com.isl.springboot.swaggerexample.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import com.isl.models.PostRequest;
import com.isl.models.PostResponse;
import com.isl.models.SampleResponse;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "HelloWorld Resource", description = "shows hello world")
public class HelloResource {

    @ApiOperation(value = "Returns Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Hello World")
            }
    )
    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @ApiOperation(value = "Returns Hello World")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @ApiOperation(value = "Returns Hello World")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
    @DeleteMapping("/delete")
    public String hellodelete(@RequestBody final String hello) {
        return hello;
    }
    @PatchMapping("/patch")
    public String hellopatch(@RequestBody final String hello) {
        return hello;
    }
}

