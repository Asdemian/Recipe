package pro.sky.recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeApplication.class, args);
        System.out.println("Название: Recipe");
        System.out.println("Функции: Web запросы по правилам RESTful");
        System.out.println("Проект будет реализован с помощью: RESTful-сервисов, Spring Framework и API");
        System.out.println("Проект написан на: JAVA");
    }

}
