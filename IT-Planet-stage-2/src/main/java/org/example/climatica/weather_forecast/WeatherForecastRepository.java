package org.example.climatica.weather_forecast;

import org.example.climatica.model.WeatherForecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherForecastRepository extends JpaRepository<WeatherForecast, Long> {
}
