package koschei.config;

import koschei.models.Duck5;
import koschei.models.Island2;
import koschei.models.Rabbit4;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Rabbit4 getRabbit(Duck5 duck) {
        return new Rabbit4(duck);
    }
}
