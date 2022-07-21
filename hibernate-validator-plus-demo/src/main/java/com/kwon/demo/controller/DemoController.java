package com.kwon.demo.controller;

import com.kwon.demo.dto.User;
import com.kwon.validatorplus.groups.PostGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kwon
 */
@RestController
public class DemoController {

    @RequestMapping("test")
    public String test(@Validated(PostGroup.class) User user) {
        return user.getUser();
    }
}
