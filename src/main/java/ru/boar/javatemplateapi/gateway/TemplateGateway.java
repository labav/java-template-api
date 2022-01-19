package ru.boar.javatemplateapi.gateway;

import org.springframework.stereotype.Component;

// TemplateGateway TODO: например слазить в их систему с WIKI
@Component
public class TemplateGateway {

    public String giveMeAWikiPic() {
        return "now with a pickpick";
    }
}