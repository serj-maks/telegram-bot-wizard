package edu.bot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Configuration
@Data
@PropertySource("application.yml")
public class BotConfig {

    @Value("${bot.username}")
    String botUsername;

    @Value("${bot.token}")
    String botToken;
}
