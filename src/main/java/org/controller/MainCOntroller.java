package org.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by srujangopu on 3/23/16.
 */

@RestController
public class MainCOntroller {

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello World";
    }
}
