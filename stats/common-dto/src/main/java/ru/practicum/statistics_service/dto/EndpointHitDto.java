package ru.practicum.statistics_service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EndpointHitDto {
    private final String app;
    private final String uri;
    private final String ip;
    private final String timestamp;
}
