package com.springbootweather.weather_ai_agent.config;

import com.springbootweather.weather_ai_agent.tools.SimpleDateTimeTool;
import com.springbootweather.weather_ai_agent.tools.WeatherTool;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class AiConfig
{

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder, SimpleDateTimeTool simpleDateTimeTool, WeatherTool weatherTool)
    {
        return builder
                .defaultTools(simpleDateTimeTool,weatherTool )
                .build();
    }

    @Bean
    public RestClient restClient()
    {
        return RestClient
                .builder()
                .baseUrl("http://api.weatherapi.com/v1")
                .build();
    }

}