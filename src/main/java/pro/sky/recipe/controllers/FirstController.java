package pro.sky.recipe.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String helloWorld() {
        return "Hello, People !!! " +
                " Приложение запущено";

    }

    @GetMapping("/info")
    public String recipe() {
        return "Имя ученика: Дмитрий. " +
                " Название проекта: Рецепты. " +
                " Дата создания проекта: 10.01.2023. "+
                " Описание: (Рецепты для кулинарии)";
    }
}
