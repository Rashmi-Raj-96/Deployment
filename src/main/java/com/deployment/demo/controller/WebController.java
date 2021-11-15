package com.deployment.demo.controller;

import com.deployment.demo.model.PostRequest;
import com.deployment.demo.model.PostResponse;
import com.deployment.demo.model.ResponseModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/sample")
    public ResponseModel Sample(@RequestParam(value = "name",
            defaultValue = "Robot") String name) {
        ResponseModel response = new ResponseModel();
        response.setId(1);
        response.setMessage("Your name is " + name);
        return response;
    }

    @PostMapping("/test")
    public PostResponse Test(@RequestBody PostRequest inputPayload) {
        PostResponse response = new PostResponse();
        response.setId(inputPayload.getId()*100);
        response.setMessage("Hello " + inputPayload.getName());
        response.setExtra("Lets Start Deployment");
        return response;
    }


}
