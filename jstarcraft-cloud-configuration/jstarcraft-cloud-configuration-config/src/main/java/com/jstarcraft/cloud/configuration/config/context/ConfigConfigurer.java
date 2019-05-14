package com.jstarcraft.cloud.configuration.config.context;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(RefreshScope.class)
@ConditionalOnProperty(name = RefreshAutoConfiguration.REFRESH_SCOPE_ENABLED, matchIfMissing = true)
@AutoConfigureBefore(HibernateJpaAutoConfiguration.class)
public class ConfigConfigurer {

    @Bean
    public ConfigManager contextRefresher(ConfigurableApplicationContext context, RefreshScope scope) {
        return new ConfigManager(context, scope);
    }

}