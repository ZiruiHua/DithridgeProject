package com.ziruih.coreservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Slf4j
public class coreController {
    @GetMapping("/stocks")
    public String getStock(@RequestParam(value = "code", required = false) String code) {
        return code;
    }
}
