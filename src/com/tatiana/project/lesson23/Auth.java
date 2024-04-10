package com.tatiana.project.lesson23;

public interface Auth {
    boolean auth(String login, String password);

    //фабричный метод
    static Auth provider (String auth){
        return switch (auth) {
            case "google" -> new GoogleAuth();
            case "github" -> new GithubAuth();
            case "app" -> new AppAuth();
            default -> throw new IllegalArgumentException(
                    "Тип авторизации не может быть обработан");

        };
    }
}

//фабрич методы часто работабт рядом с перечислениями
     //   [Войти через Google] -> "google"
     //   [Войти через App] -> "app"
     //   [Войти через Github] -> "github"



