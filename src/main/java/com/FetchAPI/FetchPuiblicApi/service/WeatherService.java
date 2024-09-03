package com.FetchAPI.FetchPuiblicApi.service;

import com.FetchAPI.FetchPuiblicApi.response.SearchByCity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final RestClient restClient;

    public SearchByCity searchByCityName(String stationName,String period){
        return restClient.get()
                .uri("/getAemetStation/{stationName}/{period}/",stationName,period)
                .retrieve()
                .body(SearchByCity.class);
    }

}
