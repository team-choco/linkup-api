package comfig;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger2Config {
    @Bean
    public GroupedOpenApi LinkupApi() {
        return GroupedOpenApi.builder()
                .group("v1-definition")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI spingShopOpenAPI() {
        return new OpenAPI()
                //.components(new Components())
                .info(new Info().title("LinkUpAPI")
                        .description("LinkUp API 입니다.")
                        .version("v0.0.1"));
    }
}
