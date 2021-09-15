package ru.boar.javatemplateapi.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.boar.javatemplateapi.dto.HelloResponse;
import ru.boar.javatemplateapi.gateway.TemplateGateway;

@Slf4j
@Service
@RequiredArgsConstructor
public class HelloService {

    private final TemplateGateway templateGateway;

    public HelloResponse makeSomeHelloMagic() {
        log.info("hello: world");
        var response = HelloResponse.builder()
                .id("1")
                .message(templateGateway.giveMeAWikiPic())
                .name("Hardcoded name")
                .build();

        return response;
    }

}
