package ru.boar.javatemplateapi.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class HelloResponse {
    private String message;
    private String id;
    private String name;
}
