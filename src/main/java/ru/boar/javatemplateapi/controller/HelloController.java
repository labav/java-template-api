package ru.boar.javatemplateapi.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.boar.javatemplateapi.dto.HelloResponse;
import ru.boar.javatemplateapi.service.HelloService;


@RestController
@RequestMapping("/template")
@Slf4j
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping(value = "/hello")
    public ResponseEntity<HelloResponse> hello() {
        log.info("hello: world");

        return ResponseEntity.ok(helloService.makeSomeHelloMagic());
    }
}