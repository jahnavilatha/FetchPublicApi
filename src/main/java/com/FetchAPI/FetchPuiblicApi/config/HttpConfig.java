package com.FetchAPI.FetchPuiblicApi.config;


import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@Slf4j
public class HttpConfig {

//    private static final Logger log = LoggerFactory.getLogger(HttpConfig.class);


    @Value("${api.base.url}")
    private String BASE_URL;

    @Bean
    public RestClient restClient(){
        log.info("BASE_URL:{}",BASE_URL);
        return RestClient.create(BASE_URL);
    }

}
