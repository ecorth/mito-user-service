package com.eco.mx.mitouserservice.config;

import com.eco.mx.mitouserservice.model.entity.UserEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;

@Configuration
public class UserEntityProcessor implements RepresentationModelProcessor<EntityModel<UserEntity>> {
    //con esto el repository rest resources ya no devolvera tantos datos innecesarios
    @Override
    public EntityModel<UserEntity> process(EntityModel<UserEntity> model) {
        return EntityModel.of(model.getContent());
    }
}
