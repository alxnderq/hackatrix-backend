package com.thot.customermicroservice.expose.web;

import com.thot.customermicroservice.client.business.UserService;
import com.thot.customermicroservice.client.dto.UserDTO;
import com.thot.customermicroservice.client.model.api.get.Students;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@Api(tags = "Thot")
@RequestMapping("thot/v1/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login/student")
    public Students loginStudent(@RequestBody UserDTO user) {
        return userService.loginStudent(user.getCode(), user.getPassword());
    }
}
