package com.springbootweather.weather_ai_agent.services;

import com.springbootweather.weather_ai_agent.tools.SimpleDateTimeTool;
import com.springbootweather.weather_ai_agent.tools.WeatherTool;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ChatService
{
   private ChatClient chatClient;

   private WeatherTool weatherTool;

   private String weatherApiKey;

   public ChatService(ChatClient chatClient,WeatherTool weatherTool)
   {
       this. chatClient = chatClient;
       this.weatherTool= weatherTool;

   }

   public String chat(String q)
   {
       return chatClient
               .prompt()
               .user(q)
               .call()
               .content();
   }
}
