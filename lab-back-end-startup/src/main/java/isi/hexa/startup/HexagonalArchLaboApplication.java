package isi.hexa.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication
@EntityScan("com.isi.hexa.core")
@EnableJpaRepositories(basePackages = "com.isi.hexa.jpa")
@ComponentScan(basePackages = {"isi.hexa.api.rest", "com.isi.hexa.jpa","com.isi.hexa.api","com.isi.hexa.core"})
public class HexagonalArchLaboApplication {

    public static void main(String[] args) {
        Environment env = SpringApplication.run(HexagonalArchLaboApplication.class, args).getEnvironment();
    }
}
