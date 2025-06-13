package com.dharbor.bootcamp.notificationpersistence.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(com.dharbor.bootcamp.notificationpersistence.domain.Notification.class);
        config.exposeIdsFor(com.dharbor.bootcamp.notificationpersistence.domain.User.class);
    }
}
