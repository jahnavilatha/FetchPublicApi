package com.FetchAPI.FetchPuiblicApi.controller;

import com.FetchAPI.FetchPuiblicApi.response.SearchByCity;
import com.FetchAPI.FetchPuiblicApi.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1.0/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;
    @GetMapping("/search")
    public ResponseEntity<SearchByCity> SearchByCityName(@RequestParam String stationName,@RequestParam String period){
        return ResponseEntity.ok(weatherService.searchByCityName(stationName,period));
    }

    @ExceptionHandler
    public ResponseEntity<String> handleException(Exception e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
