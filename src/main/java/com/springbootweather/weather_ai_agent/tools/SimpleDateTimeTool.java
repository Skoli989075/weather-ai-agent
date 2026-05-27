package com.springbootweather.weather_ai_agent.tools;

import org.slf4j.Logger;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class SimpleDateTimeTool
{

    private final Logger logger= org.slf4j.LoggerFactory.getLogger(getClass());

    @Tool(description = "Get the current date and time in users zone.")

    public String getCurrentDateTime()
    {
        this.logger.info("Tool calling");
        this.logger.info("Get the current date and time in user zone.");
        return LocalDateTime.now()
                .atZone(LocaleContextHolder.getTimeZone().toZoneId())
                .toString();
    }
}
