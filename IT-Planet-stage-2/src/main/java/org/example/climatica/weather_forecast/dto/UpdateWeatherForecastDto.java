package org.example.climatica.weather_forecast.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UpdateWeatherForecastDto {
    private Float temperature;
    private String weatherCondition;
    private LocalDateTime dateTime;
}